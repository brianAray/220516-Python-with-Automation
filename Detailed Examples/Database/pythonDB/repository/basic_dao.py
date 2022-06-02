import psycopg2
from utility import connection_factory

# This is a create method that takes in a data field for the table
def insert(name):
    # This is the SQL query we will use
    # It is written in PSQL but the value we are inputting is %s
    # There is also a RETURNING id which will return the primary key
    # as the primary key field is id in the table
    # |_id__|___name____|
    # |  1  |   Greg    |
    # default is what we use instead of a value for the primary key
    # as primary key has a serial primary key constraint that will
    # auto generate so we place default
    qry = "INSERT INTO test_table VALUES (default, %s) RETURNING id;"
    try:
        # connection factory is a user created class that creates a
        # connection
        conn = connection_factory.get_connection()
        # A cursor is created using the cursor, this will be used to
        # interact with the database
        cursor = conn.cursor()
        # We execute the query using the method execute
        # the parameters are the url and a tuple containing the replacement
        # for %s
        # This protects against sql injection attacks (check it out if you 
        # haven't heard about it)
        cursor.execute(qry, (name,))
        # We asked for it to return the id so we grab the id using fetchone()
        # this returns an array so we grab the first one
        id = cursor.fetchone()[0]
        # commit is used for the database on a successful procedure
        # if it fails then we can roll it back in the error
        conn.commit()
        print (f"Record added successfully: ID {id}")
    except(Exception, psycopg2.DatabaseError) as error:
        print(error)
        conn.rollback()
    finally:
        # finally makes sure that the connection will always close
        # we make sure to check it has at least been created otherwise
        # you will get an error trying to close something that doesn't exist
        if conn is not None:
            conn.close()
        print("Database connection closed")


def select():
    # This is the SQL query we will use
    qry = "SELECT * FROM test_table;"
    try:
        # connection factory is a user created class that creates a
        # connection
        conn = connection_factory.get_connection()
        # A cursor is created using the cursor, this will be used to
        # interact with the database
        cursor = conn.cursor()
        # We execute the query using the method execute
        cursor.execute(qry)
        # We loop through the result cursor as a SELECT * will return
        # all matched entries in the table
        while True:
            # We fetch eatch entry one by one
            record=cursor.fetchone()
            # If the record happens to be empty then we will stop the
            # loop using break
            if record == None:
                break
            # When this loops through we print and then go to the next
            # entry in the cursor
            print(record)
    except(Exception, psycopg2.DatabaseError) as error:
        print(error)
    finally:
        if conn is not None:
            conn.close()
        print("Database connection closed")
