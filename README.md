# 🎓  My First Program

**MyFirstProgram** is a basic example of using java to develop your programs.

## Preparation

**Install curl**
```
sudo apt-get install curl

curl --version
```
 **Install Java Version Mananger**

```
curl -sL https://github.com/shyiko/jabba/raw/master/install.sh | bash && . ~/.jabba/jabba.sh

jabba ls-remote
jabba install openjdk@1.11
jabba install openjdk@1.10
jabba ls
jabba use openjdk@1.10
java --version
jabba use openjdk@1.11
java --version
```

## Coding

> Create a folder structure
```
src/com/dio/base/
```

> Order
```
# vim src/com/dio/base/Order.java

package com.dio.base;

public class Order {

        private final String code;

        public Order (String code){
                this.code = code;
        }

        @Override
        public String toString() {
                return "Order=[" +
                        "code='" + code + "'" +
                        "]";
        }
}
```

> Main program

```
# vim src/com/dio/MyFirstProgram.java

package com.dio;

import com.dio.base.Order;

public class MyFirstProgram{
        public static void main(String[] args){
                final Order order = new Order("code1234");
                System.out.println(order);
        }
}
```


## Execution
```
javac -d myFirstProgram/ -sourcepath src/ src/com/dio/MyFirstProgram.java

cd myFirstProgram

java com.dio.MyFirstProgram
```


# 🎓  What is OOP?

Object Oriented Programming is about creating objects that contain both data and methods.

- **OOP** is faster and easier to execute
- **OOP** provides a clear structure for the programs
- **OOP** helps to keep code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
- **OOP** makes it possible to create full reusable applications with less code and shorter development time

Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

## Four Principles of OOP

- **Inheritance** child classes inherit data and behaviors from parent class
- **Encapsulation** containing information in an object, exposing only selected information
- **Abstraction** only exposing high level public methods for accessing an object
- **Polymorphism** many methods can do the same task

## Blocks of OOP
- Classes
- Objects
- Methods
- Attributes

## Java OOP


## References

https://github.com/shyiko/jabba