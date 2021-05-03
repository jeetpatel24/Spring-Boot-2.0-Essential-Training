# Connectivity to Embedded Database
## Clone this application and run in any IDE (say Intellij)
### open web browser and hit `http://localhost:8080/h2-console`
#### now you can see your output here


#### what we did in this (step by step)
#### 1. create Models for Staff and Room
#### 2. create Controllers for Staff and Room
#### 3. crerate Services for Staff and Room
#### 4. create data.sql and schema.sql in resources
#### 5. Add the following in application.properties
##### logging.level.org.springframework.jdbc.datasource.init.ScriptUtils=debug
###### Because of this property we can see output in the console after running the application
##### spring.h2.console.enabled=true
###### This gives us the web based way of viewing the data that's stored in our database
##### sring.datasource.url=jdbc:h2:mem:testdb
###### this is preety standard pattern indicating the in-memory test-db


