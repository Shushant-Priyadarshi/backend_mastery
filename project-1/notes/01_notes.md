# Notes

## Basics

### Beans
- A **Spring Bean** is simply an object that is managed by the **Spring Container** 
(a system that controls the lifecycle of objects). Instead of creating objects 
manually using new, Spring does it for you.

- example :

```
public class Car {
    public void drive() {
        System.out.println("Driving a car...");
    }
}


```
- Without Spring, you would create an object like this:

```
Car myCar = new Car();
myCar.drive();


```

- Method 1: Using @Component:

```
import org.springframework.stereotype.Component;

@Component  // This tells Spring to create and manage this object
public class Car {
    public void drive() {
        System.out.println("Driving a car...");
    }
}

```
- Method 2: Using @Bean
```
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car car() {
        return new Car();  // Spring will manage this object
    }
}


```






### IOC 
- IoC means that instead of you manually creating objects (new Car()), 
    the Spring Container will automatically create and manage them.

    - Before Spring: You control object creation (new Car()).
    - After Spring: Spring controls object creation (@Component, @Autowired).
    - This helps in: 
       - ✅ Loose Coupling (classes don’t depend on each other directly).
       - ✅ Easier Testing (objects are automatically injected).
       - ✅ Better Code Management (Spring handles dependencies).

### Maven
- Maven is a build automation tool that helps manage dependencies (external libraries) and build Java projects.

- Instead of manually downloading JAR files, Maven will automatically download the required libraries.

- How Does It Work?
  - Maven uses a file called pom.xml to manage dependencies.

### Dependency Injection
- Dependency Injection (DI) is a design pattern used in Spring to manage dependencies between objects automatically.
  Instead of creating objects manually using new, Spring injects them where needed.

### ApplicationContext 

- ApplicationContext is the container in Spring that manages all beans and their dependencies. It acts as a central registry that:
    - Creates beans (objects marked with @Component or @Bean).
    - Resolves dependencies using Dependency Injection.
    - Manages the lifecycle of beans.