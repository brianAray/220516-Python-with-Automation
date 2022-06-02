from configparser import ConfigParser

# In order to setup up the connection to the database
# we use a configuration file called database.ini
# within that file there is a [postgresql] and every field
# in that will be read
def config(filename='database.ini', selection='postgresql'):
    # Create a parser for the database.ini file
    parser = ConfigParser()
    # Read the configuration file
    parser.read(filename)

    # We read all the fields and match a variable to a field we are
    # looking for 
    host = parser['postgresql']['host']
    user = parser['postgresql']['user']
    database = parser['postgresql']['database']
    password = parser['postgresql']['password']

    # using the matched fields, we create a dictionary to hold the data
    db = {
        "host": host,
        "user": user,
        "database": database,
        "password": password
    }
    # The parameters have been read and can be returned
    return db