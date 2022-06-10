import psycopg2

# This file is used to define a function to get the database connection

def get_connection():
    connection = psycopg2.connect(
            database="postgres",
            user="postgres",
            password="password123",
            host="brian-pwa-db.cekyyol8wngg.us-east-2.rds.amazonaws.com",
            port="5432"
    )

    return connection