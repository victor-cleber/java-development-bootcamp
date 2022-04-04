# 🎓  My First Program

**src/com/dio/MyFirstProgram.java** is a basic example of using Java to develop your programs.

## Prepare

> Install curl
```
sudo apt-get install curl

curl --version
```
 > Install Java Version Mananger

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

## Code 

> Create a folder structure 
```
src/com/dio/base/
```

> Create an Order class
```
# vim src/com/dio/base/Order.java

package com.dio.base;

import java.math.BigDecimal;

public class Order {
                
        private final String code;
        private final BigDecimal totalValue;

        public Order (String code, BigDecimal totalValue){
                this.code = code;
                this.totalValue = totalValue;
        }
        
        @Override
        public String toString() {
                return "Order=[" +
                        "code='" + code + "'" +
                        "fees=$'" + calculateFee() + "'" +
                        "]";
        }

        public BigDecimal calculateFee(){
                if (this.totalValue > 100){
                        return this.totalValue.multiply(new BigDecimal("0.99"));
                }else{
                        return this.totalValue;
                }                
        }
}
```

> Create a Main program

```
# vim src/com/dio/MyFirstProgram.java

package com.dio;

import com.dio.base.Order;

public class MyFirstProgram{
        public static void main(String[] args){
                final Order order = new Order("code1234", 540);
                System.out.println(order);
        }
}
```

## Execute
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

- **Inheritance** child classes inherit data and behaviors from parent class.
- **Encapsulation** containing information in an object, exposing only selected information.
- **Abstraction** only exposing high level public methods for accessing an object.
- **Polymorphism** many methods can do the same task.

## Blocks of OOP
- Classes
- Objects
- Methods
- Attributes

## Java Key Words
abstract<br>        continue        float           native          strictfp        void
assert          default         for             new             super           volatile
boolean         do              goto            null            switch          while
break           double          if              package         syncronized
byte            else            implements      private         this
case            enum            import          protected       throw
catch           extends         instance of     public          throws
char            false           int             return          transient
class           final           interface       short           true
const           finally         long            static          try

## Acesss modifiers
Java has two types of modifiers: access modifiers and non-access modifiers.

Whith the access modifiers we can specify the accessibility or scope of a field, method, constructor, or class. We have a power to change the access level of fields, constructors, methods, and class by applying the access modifier on it.

They are four types of Java access modifiers:
- **Private**: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
- **Default**: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
- **Protected**: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
- **Public**: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

> There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc. (https://www.javatpoint.com/access-modifiers)

## Methods
- **Constructors** define how a class will be buit.
- **Common** are methods defined by the business rules.

## Java Conditions and If Statements
Java supports the usual logical conditions from mathematics:

- Less than: a < b
- Less than or equal to: a <= b
- Greater than: a > b
- Greater than or equal to: a >= b
- Equal to a == b
- Not Equal to: a != b

**if else** 
```
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
```
**switch case**
```
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)
```

## Java Loop
**do** 

**while**

**for**

**enhanced for**


## References
https://github.com/shyiko/jabba
https://www.w3schools.com/java/default.asp