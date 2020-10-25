
# DAY 2 JAVA PROGRAMMING

## Types of Variables on Basis of Scope

    - static
    - local
    - instance

### Types of Variables on the basis of the type

    -  Normal (Value typed variables) / Ordinary 

    - Reference Variables : all non primitive types are of the reference and the (type)[]

### EXAMPLE

```java

class Example{

    Test t1; // instance reference variables

    int e=20; // instance and ordinary variable

    static int a=10;  // ordinary static variable.

public static void main(String[]args){

    Example obj; // local and reference variable

    static int c =10;   //error cannot have static local vriable 

    int b; // local and ordinary variable 

}

}
```
          
         
 **IMPORTANT**



|  scope  |   Ordinary  | Reference |
|---------|-------------|-----------|
|  local  |   blank     |   blank   |
|         |             |           |
| instance| 0,0.0,false |   null    |
|         |             |           |
| static  | 0,0.0,false |   null    |
|         |             |           |
