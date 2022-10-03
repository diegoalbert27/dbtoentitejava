import mysql.connector
from mysql.connector import Error

def open_connection():
    try:
        connection = mysql.connector.connect(host='localhost',
                                            database='jvision2',
                                            user='root',
                                            password='')

        if connection.is_connected():
            db_Info = connection.get_server_info()
            print("Connected to MySQL Server version ", db_Info)
            cursor = connection.cursor()
            cursor.execute("select database();")
            record = cursor.fetchone()
            print("You're connected to database: ", record)

            return connection

    except Error as e:
        print("Error while connecting to MySQL", e)
    finally:
        if connection.is_connected():
          cursor.close()


def execute_sql(connection, sql):
    cursor = connection.cursor()
    cursor.execute(sql)
    return cursor


def close_connection(connection):
    if connection.is_connected():
            connection.close()
            print("MySQL connection is closed")

