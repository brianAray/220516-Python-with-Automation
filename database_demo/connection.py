import psycopg2

def get_connection():
    connection = psycopg2.connect(
            database="postgres",
            user="postgres",
            password="password123",
            host="demo-database-python.cvmncwswsek7.us-east-2.rds.amazonaws.com",
            port="5432"
    )

    return connection
