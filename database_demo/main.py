from connection import get_connection

def main():

    try:
        connection = get_connection()
        print("Connection established to database")
        insert_query = "INSERT INTO user_table VALUES(default, %s, %s);"

        cursor = connection.cursor()
        new_username = input("Type a new username: ")
        new_password = input("Type a new password: ")

        cursor.execute(insert_query, (new_username, new_password))

        print("Executing INSERT query")

        connection.commit()

    except(psycopg2.DatabaseError) as error:
        print(error)
        connection.rollback()
    finally:
        if connection is not None:
            connection.close()
        print("Connection to database closed")


    try:
        connection = get_connection()
        print("Connection established to database")
        select_query = "SELECT * FROM user_table;"

        cursor = connection.cursor()
        cursor.execute(select_query)
        print("Executing SELECT query")

        while True:
            record = cursor.fetchone()
            print(record)

            if record == None:
                break
    except(psycopg2.DatabaseError) as error:
        print(error)
    finally:
        if connection is not None:
            connection.close()
        print("Connection to database closed")

if __name__ == "__main__":
    main()
