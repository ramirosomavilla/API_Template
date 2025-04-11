# API Template

This project is a Spring Boot REST API template that provides a solid foundation for building scalable and maintainable web services.

## Prerequisites

- Java 17 or higher
- Maven 3.6.x or higher
- Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)

## Getting Started

### Clone the repository

```bash
git clone https://github.com/ramirosomavilla/API_Template
cd API_Template
```

### Setup and Run

To get the application running, you need to follow these steps in order:

1. First, build the project:

```bash
mvn clean install
```

2. Then, run the application:

```bash
mvn spring-boot:run
```

> **Important**: Both commands must be executed in this specific order. The `clean install` step is necessary to build all dependencies and compile the code before running the application.

The application will start on `http://localhost:8080`

## Project Structure

```
src/
├── main/
│   ├── java/         # Java source files
│   └── resources/    # Configuration files
└── test/
    └── java/         # Test files
```

## Features

- Spring Boot REST API
- Maven build system
- Structured project layout
- Ready for development

## Development

To start developing new features:

1. Create a new branch
2. Make your changes
3. Write tests if applicable
4. Submit a pull request

## Building for Production

To build the application for production:

```bash
./mvnw clean package
```

This will create a JAR file in the `target` directory.

## Running Tests

```bash
./mvnw test
```

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details
