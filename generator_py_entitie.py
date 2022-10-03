from pathlib import Path
import data_types
import helpers
import mysql_connect


def generator(table_name, file_abs_path, connection, prefix_db=''):
    table_name_for_title = table_name.lower().split("_")

    if prefix_db in table_name_for_title:
        table_name_for_title.remove(prefix_db)

    for item in table_name_for_title:
        index = table_name_for_title.index(item)
        item = item.capitalize()
        table_name_for_title[index] = item

    table_name_for_title = ''.join(table_name_for_title)

    file = Path(file_abs_path + "/entities/" +
                table_name_for_title + ".py")
    file.touch(exist_ok=True)

    file_open = open(file, "w")

    file_open.write("class " + table_name_for_title + ":")
    file_open.write(helpers.generate_line_break(2))

    file_open.write(helpers.generate_tabulations(
    ) + "TABLE_NAME = \"" + table_name + "\";")
    file_open.write(helpers.generate_line_break(2))

    record = mysql_connect.execute_sql(
        connection, "DESCRIBE " + table_name)
    table_struct = record.fetchall()

    for struct in table_struct:
        field = struct[0]
        type_field = struct[1].split("(")[0]

        file_open.write(helpers.generate_tabulations() +
                        field + " = " + "\"" + field + "\"")

        file_open.write(helpers.generate_line_break())

    file_open.write(helpers.generate_line_break())

    params_construct = []

    for struct in table_struct:
        field = struct[0]
        type_field = struct[1].split("(")[0]

        file_open.write(helpers.generate_tabulations() + "__" + field + " = None")
        file_open.write(helpers.generate_line_break())

        params_construct.append(field)

    file_open.write(helpers.generate_line_break())

    file_open.write(helpers.generate_tabulations() +
                    "def __init__(self, " + ', '.join(params_construct) + "):")

    file_open.write(helpers.generate_line_break())

    for struct in table_struct:
        field = struct[0]

        file_open.write(helpers.generate_tabulations(
            2) + "self." + "__" + field + " = " + field)
        file_open.write(helpers.generate_line_break())

    file_open.write(helpers.generate_line_break(2))

    for struct in table_struct:
        field = struct[0]
        type_field = struct[1].split("(")[0]

        """ GETTERS """
        file_open.write(helpers.generate_tabulations(
            1) + "def" + " get_" + field.capitalize() + "(self):")

        file_open.write(helpers.generate_line_break())

        file_open.write(helpers.generate_tabulations(
            2) + "return self.__" + field.lower())

        file_open.write(helpers.generate_line_break())

        file_open.write(helpers.generate_line_break(2))

        """ SETTERS """
        file_open.write(helpers.generate_tabulations(1) + "def set_" +
                        field.capitalize() + "(self, " + field.lower() + "):")

        file_open.write(helpers.generate_line_break())

        file_open.write(helpers.generate_tabulations(
            2) + "self.__" + field.lower() + " = " + field.lower())

        file_open.write(helpers.generate_line_break())

        file_open.write(helpers.generate_line_break())

    file_open.close()
