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

### Package By Feature

In this project we will be using the "Package by feature" method of development. This means that if we have a feature like ```run```, we will be putting the Controller, Model, and Service files for the ```run``` feature all within the ```run``` package (file, dictory). So if we create a feature for ```user```, the Controller, Model, and Service file will be placed within the ```user``` package (file, dictory).

The other method would be to place all files related to Controllers, Model, and Service within their respective package (file, dictory).

## Maven Commands

```./mvnw spring-boot:run``` : Type this into the internal when the dictory is at run_tracker level and Maven will begin to run on the PORT currently connected to it.  


## What's a bean?
A ```bean``` is nothing more than a instances of a class with some metadata around it. When you hear bean, think this is an instance of a class that the spring container (the huge application context is container objects) is managing for me. 

## What is a EMUN

An ```emun``` only allows for a specfic set of values to be responses when a object is called. For example, if we have a ```enum``` for ```location``` and the only possible values that ```enum``` are ```INSIDE``` or ```OUTSIDE```, calling ```location``` will over send an answer of ```INSIDE``` or ```OUTSIDE```.


[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url-Bucsa]: https://www.linkedin.com/in/justin-bucsa