# Week 2 - Day 3 - REST / SQL
A study guide to help you know what to research and where to find information for the topics this week. This should not be treated as your only source of information but as a jump off point to create your own research documents. Collaborate with your team and your batch mates to get a wide range of topics covered quickly. The training course is fast so make sure you take your time to understand the underlying knowledge with the technologies you will see during training.

<br>

---
# Useful Tools

### [Mockaroo](https://www.mockaroo.com/)

Eventually you will reach a point where you need to start testing your database, in order to quickly get dummy data (You do not want to test your programs with actual company data) you have a few options. A simple and quick option is using Mockaroo to generate dummy data for you!

<br>

---

# DBMS
- https://www.geeksforgeeks.org/introduction-of-dbms-database-management-system-set-1/
- https://www.javatpoint.com/dbms-tutorial
- https://en.wikipedia.org/wiki/Relational_database
- https://www.codecademy.com/article/what-is-rdbms-sql

---
## AWS RDS (PostgreSQL)

> Make sure that when you set up your RDS that you are using the free tier and it is for PostgreSQL

- https://aws.amazon.com/rds/
- https://www.techtarget.com/searchaws/definition/Amazon-Relational-Database-Service-RDS
- https://www.learnaws.org/2022/03/04/rds-free-tier/
- https://activity.huaweicloud.com/intl/en-us/20190911192440637.html

### Questions
- What is an RDS?
- Why do we use a remote database?
- How do you use an RDS?
- How do you connect to an RDS?

---
## Questions
- What is a database?
- What does DBMS stand for?
- Why do we use a database instead of saving it as a file?
- What is an example of a DBMS?
- What is an RDBMS?

<br>

---

# SQL (PostgreSQL)
- https://www.springboard.com/blog/data-analytics/what-is-sql/
- https://www.tutorialspoint.com/sql/sql-overview.htm
- https://en.wikipedia.org/wiki/SQL

---
## DDL
- https://search.brave.com/search?q=postgresql+ddl&source=web
- https://www.ibm.com/docs/en/i/7.1?topic=programming-data-definition-language
- https://web.csulb.edu/colleges/coe/cecs/dbdesign/dbdesign.php?page=sql/ddldml.php
- https://study.com/academy/lesson/data-definition-language-ddl-definition-example.html
  
### Questions
> Make sure the language you are writing your SQL script in is `PostgreSQL`
- What is DDL?
- How do you create a table with these requirements:
  -  Table name `users` 
  -  Primary key `id` that auto updates it's value
  -  Unique field `username`
  -  Required field `pass`
- How do you alter an already existing tables' name without deleting it?
- How do you alter an already exisitng tables' column name without deleting it?
- How do you delete a table?
- How do you delete a column on a table without deleting the table?

---
## DML
- https://www.postgresql.org/docs/9.2/dml.html
- https://search.brave.com/search?q=DML+sql&source=desktop
- https://www.sqlservercentral.com/articles/postgresql-dml-statements
- https://cloud.google.com/spanner/docs/reference/postgresql/dml-syntax

### Questions
> Make sure the language you are writing your SQL script in is `PostgreSQL`
- What is DML?
- What are `DEFAULT` values and where do you use them?
- How do I insert a record into a table?
- How do I delete a record in a table that has a specific condition that I want to match?
- How do I update all the values in a table that match a criteria?
- What are aliases?
- What is a `WHERE` clause?

---
## DQL
- https://www.postgresql.org/docs/9.1/queries-with.html
- https://en.wikipedia.org/wiki/Data_query_language
- https://www.pluralsight.com/guides/querying-data-with-sql-dql
  
### Questions
> Make sure the language you are writing your SQL script in is `PostgreSQL`
- What is DQL?
- Where would I use DQL?
- How do I get a record in a table that matches a criteria that I am looking for?
- What would be returned if I did `SELECT * FROM table`?
- What is `WHERE` for in DQL?

---
## DCL
- https://onecompiler.com/tutorials/postgresql/commands/dcl-commands
- https://www.ibm.com/docs/es/netezza?topic=categories-data-control-language

### Questions
> Make sure the language you are writing your SQL script in is `PostgreSQL`
- What is DCL used for?
- What are the two main commands for DCL?
- How would you give privileges in PostgreSQL?
- How would you remove privileges in PostgreSQL?
- Why is security important in a database?

---
## TCL
- https://www.postgresql.org/docs/10/pltcl.html
- https://www.javatpoint.com/tcl-commands-in-sql
- https://wiki.tcl-lang.org/page/Quick-start+guide+to+use+of+PostgreSQL+with+Tcl

### Questions
> Make sure the language you are writing your SQL script in is `PostgreSQL`
- What is TCL?
- What is a `COMMIT` used for?
- Why is TCL important in a database?
- How do you begin a transaction?
- How do you revert a failed transaction?
- How do you create a save point?

---
## Constraints
- https://www.javatpoint.com/postgresql-constraints
- https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-check-constraint/
- https://www.tutorialspoint.com/postgresql/postgresql_constraints.htm

### Questions
- What is a constraint?
- Where do I declare a constraint?
- Why should I use constraints?
- What are four constraints commonly used?
- What is so important about `PRIMARY KEY` and `FOREIGN KEY`?
- How do I use `FOREIGN KEY` to link two tables together?

---
## ACID
- https://www.essentialsql.com/sql-acid-database-properties-explained/
- https://www.ibm.com/docs/en/cics-ts/5.4?topic=processing-acid-properties-transactions
- https://www.geeksforgeeks.org/acid-properties-in-dbms/

### Questions
- What is Atomicity?
- What is Consistency?
- What is Isolation?
  - What are the different levels of isolation in a transaction?
- What is Durability?
- Why is ACID important to SQL and databases?

---
## Schema
- https://www.sqlshack.com/a-walkthrough-of-sql-schema/
- https://www.postgresql.org/docs/current/ddl-schemas.html
- https://www.postgresqltutorial.com/postgresql-administration/postgresql-schema/

### Questions
- What is a Schema?
- What is the default Schema?
- Why do we use schemas?
- How do you create a Schema?
- How do you delete a Schema?
- Why is it dangerous to delete a Schema?

---
## SQL Functions
- https://www.postgresql.org/docs/12/functions.html
- https://www.postgresqltutorial.com/postgresql-aggregate-functions/
- https://www.geeksforgeeks.org/sql-functions-aggregate-scalar-functions/
- https://www.tutorialspoint.com/postgresql/postgresql_functions.htm
- https://www.enterprisedb.com/postgres-tutorials/how-develop-user-defined-function-postgresql-stored-procedures

### Questions
- What is a function in PostgreSQL?
- What is an Aggregate Function?
- What are Aggregate Functions?
- What are Scalar Functions?
- What are 3 examples of an Aggregate Function in use?
- What are 3 examples of a Scalar Function in use?
- What is the difference between an Aggregate and Scalar function?
- How do you make your own function in PostgreSQL?
- How do you use a custom funciton in PostgreSQL?

<br>

---