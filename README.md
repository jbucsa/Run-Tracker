[![LinkedIn][linkedin-shield]][linkedin-url-Bucsa]


# Run-Tracker
This is a Java project that uses the Spring Boot library and frame work to track runs. Runs are stored in an database.

This project uses:
- Java 21
- Spring Boot 3.3.5
- Maven
- Dependencies : Spring Boot Dev Tools
- Dependencies : Spring Web
- Packaging : Jar

## Packages Notes

### Default packages

Any classes, objects, etc. placed in the ```run_tracker/src/main/java``` will serve as default files when using in any other files and thus any files using the default materials will not required ```package``` statement in the headers of the file.  

## Maven Commands

```./mvnw spring-boot:run``` : Type this into the internal when the dictory is at run_tracker level and Maven will begin to run on the PORT currently connected to it.  


## What's a bean?
A ```bean``` is nothing more than a instances of a class with some metadata around it. When you hear bean, think this is an instance of a class that the spring container (the huge application context is container objects) is managing for me. 


[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url-Bucsa]: https://www.linkedin.com/in/justin-bucsa