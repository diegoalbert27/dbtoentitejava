import mysql_connect
import os
import sys

from generator_java_entitie import generator as generator_dot_java
from generator_py_entitie import generator as generator_dot_py


def main():
    print("Initial app")

    connection = mysql_connect.open_connection()
    record = mysql_connect.execute_sql(connection, "SHOW TABLES")
    tables = record.fetchall()

    file_abs_path = os.path.abspath(os.path.dirname(__file__))

    prefix_db = 'tab'

    extention = sys.argv[1] if len(sys.argv) >= 2 else ''

    is_done = False
    
    for table in tables:
        table_name = table[0]
        
        if extention == 'java':
            generator_dot_java(table_name, file_abs_path, connection, prefix_db)
        elif extention == 'py':
            generator_dot_py(table_name, file_abs_path, connection, prefix_db)
        else:
            print('extention not found')
            break

    if is_done:
        print("Done!")


if __name__ == '__main__':
    main()
