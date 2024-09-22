# Spring Boot Multi DataSource Application
This project demonstrates a **Spring Boot** application that dynamically routes between multiple databases using **multiple DataSource configurations** and **Spring Data JPA** repositories.

## Features

- **Multiple DataSources**: Configures two or more data sources for different databases.
- **Dynamic DataSource Routing**: Implements dynamic routing between databases based on the context.
- **Repository-based Data Access**: Uses Spring Data JPA repositories for seamless database interaction.
- **Transaction Management**: Ensures correct transaction handling across different data sources.

## Technologies Used

- Spring Boot
- Spring Data JPA
- MySQL (as the example databases)
- Hibernate
- Java Persistence API (JPA)

## Project Structure

- `com.example.demo.FooDbConfig.java`: Contains configuration for db1 and EntityManager setup. It is the default database.
- `com.example.demo.BarDbConfig.java`: Contains configuration for db2 and EntityManager setup.
- `com.example.demo.webRoute`: Entity and repository for `db1`.
- `com.example.demo.bloodGroup`: Entity and repository for `db2`.

## Prerequisites

1. Java 17 or higher.
2. Maven.
3. MySQL databases set up for `db1` and `db2`.

### Database Setup
 
Configure database (`db1` and `db2`) in `application.properties` file.

- `spring.datasource.jdbc-url=jdbc:mysql://*:3306/*`
- `spring.datasource.username=*`
- `spring.datasource.password=*`
- `spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver`
####
- `spring.datasource.db2.jdbc-url=jdbc:mysql://*:3306/*`
- `spring.datasource.db2.username=*`
- `spring.datasource.db2.password=*`
- `spring.datasource.db2.driver-class-name=com.mysql.cj.jdbc.Driver`

## How to Run

### Clone this repository
- `git clone git@github.com:krHasan/sandbox-spring.git`
- `cd your-repository-folder`
- `git checkout multiple-datasource`

### Update `application.properties` with your MySQL credentials.

### Build and run the application:
- `mvn clean install`
- `mvn spring-boot:run`

### Test API endpoints
- GET /webRoute: Fetch web route data from db1
- GET /bloodGroup: Fetch blood group list from db2

## Troubleshooting
### Common Errors
Upcoming

## Contributing

This `README.md` provides an overview of the project, explains the key features, shows how to set it up and run it, and addresses common issues that could arise. You can adjust it further to suit your needs! Let me know if you'd like to add or change any sections.

## License
MIT (do whatever you want to do :smile: )

Made by [krHasan](https://www.linkedin.com/in/kr-hasan/)