from repository import basic_dao

def main():
    basic_dao.select()
    basic_dao.insert(input("Type in a name!\n"))
    basic_dao.select()


if __name__ == '__main__':
    main()