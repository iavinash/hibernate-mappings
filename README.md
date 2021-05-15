# Hibernate-Mappings Examples with Spring Data JPA
JPA Entity Relationships(Mappings), ex- @OneToOne, @ManyToOne etc. 

No need to setup external Relational DB, H2 in-memory database used that supports JDBC API and R2DBC access, with a small (2mb) footprint.

[H2 Console](http://localhost:8082/h2-console/)

# Description

Data can be inserted using the below endpoints and JSON to save data availabe [here](/src/main/resources/static/json/)
* `/api/emp/create` - Insert data into `@OneToOne` relation
* `/api/tchr/create` - Insert data into `@OneToMany` relation. Just for demonstration, data will be automatically populated into the table 
                   with `@OneToMany` relation using `CommandLineRunner`
* `/api/movie/create`- Insert data into `@ManyToMany` relation


> The application will be starting on port `8082` and the port can be changed from [here](/src/main/resources/application.properties)

# Libraries used

* Spring Boot
* Spring Data JPA with Hibernate
* H2
# Tools used
* Git 2.24.0
* IntelliJ IDEA 2021.1.1.1
* Gradle

