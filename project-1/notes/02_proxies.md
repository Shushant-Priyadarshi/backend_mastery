# Springboot Proxies

- A proxy in Spring is like a middleman between your code and the actual object. It allows Spring to add extra functionality (like logging, security, transactions) without modifying the original code.

## Why using proxies:
- To apply cross-cutting concerns (like security, logging, transactions) without changing actual code.
- To enhance methods dynamically at runtime.
- To support AOP (Aspect-Oriented Programming) in Spring.

## Types of Proxies:
- JDK Dynamic Proxy (Interface-based Proxy) → Uses `java.lang.reflect.Proxy`
-  Works only when the class implements an interface 
      - Like in service folder we first declare the methods and then implement those methods.
-  Uses Java Reflection to create a proxy.
-  Lighter and faster compared to CGLIB.
- We can implement Caching using proxy
- Let’s say we have a VehicleService interface.
```
public interface VehicleService {
    void drive();
}


```

- Now, we create a class CarService that implements the interface.
```
import org.springframework.stereotype.Service;

@Service
public class CarService implements VehicleService {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}


```
## How Spring Uses JDK Proxy?

- When `CarService` is injected somewhere, Spring creates a proxy object instead of directly giving the original object.
- The proxy object intercepts method calls and can add extra functionality (like logging, security, etc.).

## CGLIB Proxy (Class-based Proxy) → Uses `net.sf.cglib.proxy`
  - Used when there is no interface.
  - Uses bytecode generation to create a proxy.
  - Slower than JDK proxies but more flexible.

## Java Reflections
- Java Reflection is a feature that allows you to inspect and manipulate classes, methods, fields, and constructors at runtime. It is part of the `java.lang.reflect` package.

```
public class Person {
    private String name;
    public int age;

    public Person() {}

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

```
```
import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) {
        Class<?> personClass = Person.class;

        // Get class name
        System.out.println("Class Name: " + personClass.getName());

        // Get all fields
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName() + " | Type: " + field.getType());
        }

        // Get all methods
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}
```

- output:
```shell
Class Name: Person
Field: name | Type: class java.lang.String
Field: age | Type: int
Method: sayHello

```


