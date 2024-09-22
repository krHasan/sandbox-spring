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

- `com.example.demo.configuration.`: Contains configurations for multiple DataSources and EntityManager setup.
- `com.example.demo.dataSourceOne`: Entity and repository for `db1`.
- `com.example.demo.dataSourceTwo`: Entity and repository for `db2`.

## Prerequisites

1. Java 17 or higher.
2. Maven.
3. MySQL databases set up for `db1` and `db2`.

### Database Setup
 
Configure database (`db1` and `db2`) in `application.properties` file.

- `spring.datasource.db1.jdbc-url=jdbc:mysql://*:3306/*`
- `spring.datasource.db1.username=*`
- `spring.datasource.db1.password=*`
- `spring.datasource.db1.driver-class-name=com.mysql.cj.jdbc.Driver`
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
- GET /api/dataSourceOne/webRoute: Fetch WebRouteTable list from db1
- GET /api/dataSourceTwo/bloodGroup: Fetch BloodGroup list from db2

## Troubleshooting
### Common Errors
- **EntityManagerFactory Not Found:** Ensure you have the correct EntityManagerFactory and TransactionManager configuration for each DataSource.
- **Database Connection Issues:** Ensure that your MySQL databases are running and that the connection details in the application.yml or application.properties file are correct.

## Contributing

This `README.md` provides an overview of the project, explains the key features, shows how to set it up and run it, and addresses common issues that could arise. You can adjust it further to suit your needs! Let me know if you'd like to add or change any sections.

## License
MIT (do whatever you want to do :smile: )

Made by [krHasan](https://www.linkedin.com/in/kr-hasan/)