# I First Commit

# II Connectivity to Embedded Database
## Clone this application and run in any IDE (say Intellij)
### open web browser and hit `http://localhost:8080/h2-console` to see your output


#### what we did in this application(lets see step by step)
#### 1. create Models for Staff and Room
#### 2. create Controllers for Staff and Room
#### 3. crerate Services for Staff and Room
#### 4. create data.sql and schema.sql in resources
#### 5. add the following in application.properties
##### logging.level.org.springframework.jdbc.datasource.init.ScriptUtils=debug
###### Because of this property we can see output in the console after running the application
##### spring.h2.console.enabled=true
###### This gives us the web based way of viewing the data that's stored in our database
##### sring.datasource.url=jdbc:h2:mem:testdb
###### this is preety standard pattern indicating the in-memory test-db


# III Building a Spring Data Repository
## Clone this application and run in any IDE (say Intellij)
### open web browser and hit `http://localhost:8080/rooms` to see your output

#### what we did in this application(lets see step by step)
#### 1. convert Room to Entity by adding `@Entity` adding all the columns
#### 2. create a new package named `data` and create a interface called `RoomPrepository` which extends `JpaRepository<Room, Long>`
#### 3. now make changes to RoomService (Connect it to RoomRepository and fetch data using `RoomRepository.findAll()` mehod)
#### 4. add this to application.properties
##### spring.jpa.hibernate.ddl-auto=none
###### Because we have an embedded database that's already been populated with a schema and data, we don't want hibernate to create that for us.


# IV Implementing Spring Security(Basics)
## Clone this application and run in any IDE (say Intellij)
### open web browser and hit `http://localhost:8080/rooms` to see login console
### username and password for login console are `user` and  `password`

#### what we did in this application(lets see step by step)
##### 1. Add the dependency to pom
`<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
</dependency>`
#### 2. create a new package config -> new class `SecurityConfig`
#### 3. create `login.html` in resources/templates
#### 4. create `AutheticationController` in controllers
