import psycopg2
from repository.connection import get_connection
from models.user_info_dto import User
from models.login_dto import Login

def select_user_info_by_id(info_id: int):
    connection = get_connection()
    cursor = connection.cursor()

    qry = f"SELECT * FROM info_table WHERE info_id = {info_id};"

    try:
        cursor.execute(qry)
        while True:
            record = cursor.fetchone()
            if record is None:
                break
            user_info = User(record[0], record[1], record[2], record[3])
            return user_info
    except(psycopg2.DatabaseError) as error:
        print(error)
    finally:
        if connection is not None:
            connection.close()

def select_by_user(login_dto: Login):
    connection = get_connection()
    cursor = connection.cursor()

    qry = f"SELECT * FROM info_table WHERE user_id = {login_dto.user_id};"

    try:
        cursor.execute(qry)
        while True:
            record = cursor.fetchone()
            if record is None:
                break
            user_info = User(record[0], record[1], record[2], record[3])
            return user_info
    except(psycopg2.DatabaseError) as error:
        print(error)
    finally:
        if connection is not None:
            connection.close()

def insert_user_info(login_dto: Login, first_name: str, last_name: str):
    connection = get_connection()
    cursor = connection.cursor()

    qry = "INSERT INTO info_table VALUES (default, %s, %s, %s) RETURNING info_id;"

    try:
        cursor.execute(qry, (login_dto.user_id, first_name, last_name))
        id = cursor.fetchone()[0]
        connection.commit()
        return id
    except(psycopg2.DatabaseError) as error:
        print(error)
        connection.rollback()
    finally:
        if connection is not None:
            connection.close()

