# To-Do Website with Java Spring Boot
This is a simple To-Do Website built using Java Spring Boot. The application uses the H2 database instead of MySQL for simplicity. Users are required to use predetermined usernames and passwords to access the application. If users want to see pre-existing To-Do lists, they can use the username "admin" and password "admin". However, if they want to create their own To-Do lists, they can use the username "user" and password "user".
## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
- Java JDK 11 or higher
- Maven 3 or higher

### Installing
1. Clone the repository:
```console
git clone https://github.com/berkaybarisalgun/My-first-web-app-with-Spring-Boot.git
```
2. Navigate to the root of the project using the terminal:
```console
cd My-first-web-app-with-Spring-Boot
```

3. Build the application using Maven:
```console
mvn clean install
```

4. Run the application:
```console
java -jar target/my-first-web-app-with-spring-boot-1.0.0.jar
```

5. Open a web browser and navigate to http://localhost:8080 to access the To-Do Website.

### Usage

Once you access the To-Do Website, you can create a new user account using the "Sign Up" button. After creating an account, you can log in and start creating your To-Do lists.

### Built With
- Java Spring Boot
- H2 Database
- Spring Data JPA

### Contributing
Contributions are welcome. Please submit a pull request if you would like to contribute to the project.

### References
This project was inspired by the tutorials of in28minutes.

### Change Log
Version 1.0.0 (2023-02-22)
- Initial release of the application.



