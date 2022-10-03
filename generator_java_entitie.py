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

    file = Path(file_abs_path + "/entities/" + table_name_for_title + ".java")
    file.touch(exist_ok=True)
    
    file_open = open(file, "w")
    
    file_open.write("package com.example.my_first_app.backend.database.entities;")
    file_open.write(helpers.generate_line_break(2))
    
    file_open.write("public class " + table_name_for_title + " {")
    file_open.write(helpers.generate_line_break())
    
    file_open.write(helpers.generate_tabulations() + "public static class NAMES {")
    file_open.write(helpers.generate_line_break())
    
    file_open.write(helpers.generate_tabulations(2) + "public static String TABLE_NAME = \"" + table_name + "\";")
    file_open.write(helpers.generate_line_break(2))

    record = mysql_connect.execute_sql(connection, "DESCRIBE " + table_name)
    table_struct = record.fetchall()

    for struct in table_struct:
        field = struct[0]
        type_field = struct[1].split("(")[0]
        
        file_open.write(helpers.generate_tabulations(2) + "public static String " + field + " = " + "\"" + field + "\";")

        file_open.write(helpers.generate_line_break())

    file_open.write(helpers.generate_tabulations() + "}")
    file_open.write(helpers.generate_line_break())

    params_construct = []

    for struct in table_struct:
        field = struct[0]
        type_field = struct[1].split("(")[0]

        data_type = ''

        if type_field in data_types.data_int():
            data_type = 'int'

        if type_field in data_types.data_float():
            data_type = 'double'

        if type_field in data_types.data_date():
            data_type = 'Date'

        if type_field in data_types.data_string():
            data_type = 'String'

        file_open.write(helpers.generate_tabulations() + "private " + data_type + " " + field + ";")
        file_open.write(helpers.generate_line_break())

        params_construct.append(data_type + " " + field)

    file_open.write(helpers.generate_line_break())

    file_open.write(helpers.generate_tabulations() + "public Ajuste(" + ', '.join(params_construct) + ") {")

    file_open.write(helpers.generate_line_break())

    for struct in table_struct:
        field = struct[0]

        file_open.write(helpers.generate_tabulations(2) + "this. " + field + " = " + field + ";")
        file_open.write(helpers.generate_line_break())

    file_open.write(helpers.generate_tabulations() + "}")
    file_open.write(helpers.generate_line_break(2))

    for struct in table_struct:
        field = struct[0]
        type_field = struct[1].split("(")[0]

        data_type = ''

        if type_field in data_types.data_int():
            data_type = 'int'

        if type_field in data_types.data_float():
            data_type = 'double'

        if type_field in data_types.data_date():
            data_type = 'Date'

        if type_field in data_types.data_string():
            data_type = 'String'

        """ GETTERS """
        file_open.write(helpers.generate_tabulations(1) + "public " + data_type + " get" + field.capitalize() + "() {")
        
        file_open.write(helpers.generate_line_break())
        
        file_open.write(helpers.generate_tabulations(2) + "return " + field.lower() + ";")

        file_open.write(helpers.generate_line_break())
        
        file_open.write(helpers.generate_tabulations(1) + "}")
        file_open.write(helpers.generate_line_break(2))

        """ SETTERS """
        file_open.write(helpers.generate_tabulations(1) + "public void set" + field.capitalize() + "(" + data_type + " " + field.lower() + ") {")
        
        file_open.write(helpers.generate_line_break())
        
        file_open.write(helpers.generate_tabulations(2) + "this." + field.lower() + " = " + field.lower() + ";")

        file_open.write(helpers.generate_line_break())
        
        file_open.write(helpers.generate_tabulations(1) + "}")
        file_open.write(helpers.generate_line_break(2))

    file_open.write(helpers.generate_line_break())

    file_open.write("}")
    file_open.write(helpers.generate_line_break(2))
    
    file_open.close()
