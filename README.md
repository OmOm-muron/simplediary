# DB settings
## DB Objects
In this project, database objects are following.
* database name: `simplediary`
* table name: `diary`
## DB creation
First, execute command below to create database `simplediary`.
```
createdb.exe -U username simplediary
```
Next, connect to database.
```
psql.exe -U username -d simplediary
```
Finally, execute DDL below to create `diary` table.
```
create table diary (
  id serial primary key,
  title varchar(256),
  content varchar(2048),
  upddate timestamp
);
```
After create table, you should quit from psql.
```
\q
```

# Edit application.properties
Edit `application.properties` like following.
```
spring.datasource.url=jdbc:postgresql://localhost:5432/simplediary
spring.datasource.username=[postgresql_user]
spring.datasource.password=[password]
```
