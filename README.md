# Random Quote Generator

The Random Quote Generator is a web application that allows users to get quote of the day. Its display random quote with author name.


## Features

- Display quote with it's author.


## Technologies Used
- Java (Spring Boot) for the backend server
- MySQL database for data storage
- Spring Data JPA for data access
- Spring Security for user authentication and authorization
- RESTful API for communication with the frontend
- React Js
- NodeJs for frontend Server
## ## Getting Started  

### Prerequisites
- Java Development Kit (JDK) version 17 or higher
- MySQL database
- IDE (e.g., IntelliJ IDEA, Eclipse) for development
- VS Code
- Node version 17 or higher

### Database Configuration
1. Create a MySQL database for the project. Update the `application.properties` file with the database credentials.

- spring.datasource.url=jdbc:mysql://localhost:3306/quotes
- spring.datasource.username=your_database_username
- spring.datasource.password=your_database_password

2. The application will automatically create the necessary tables based on the entity classes.


You should now be able to access and use the Random Quote Generator.

- [@gobinda009](https://github.com/gobinda009)

## Additional Configuration
Remember to set up a domain name, SSL certificate, and appropriate security measures based on your deployment requirements. Additionally, consider using a process manager like systemd to manage the lifecycle of the application process on the AWS instance.

## Contribution
Contributions to the project are welcome! Feel free to open issues or submit pull requests.

## License
This project is licensed under the MIT License.
