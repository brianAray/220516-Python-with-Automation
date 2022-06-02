import psycopg2

import utility.configuration as config

# This method uses the parameters taken from the configuration.py
# and database.ini to establish an actual connection
def get_connection():
    # The params from the configuration file
    params = config.config()
    # The connection is created by passing into the object psycopg2
    # connect method a keyword argument of the params
    # this is done instead of passing in each field one by one
    # This is done using **field_name
    conn = psycopg2.connect(**params)

    return conn