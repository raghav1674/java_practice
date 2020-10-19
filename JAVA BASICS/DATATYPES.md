#### THE PRIMITIVE DATATYPES IN JAVA ARE AS UNDER:

1.  boolean - implementation dependent

2.  byte - 8 bits

3.  short - 16 bits

4.  int - 32 bits

5.  long - 64 bits

6.  char - 16 bits (unicode and unicode has wide range )

7.  float - 32 bits

8.  double - 64 bits

#### THERE ARE TWO TYPES OF VARIABLES IN JAVA :

- NORMAL OR VALUE-TYPED VARIABLES OR ORDINARY VARIABLES

- REFERENCE VARIABLES.

IMPORTANT NOTE: The non-primitive data types are always teh reference variables and the [] with any type of data type is a reference variable.

JAVA do not support narrowing of the datatypes as there is loss of some data. In order to do narrowing we have to typecast it.

- float x =10.0f; // error as bydeafult decimal values are double to tell it is float either typecast or type 'f' as suffix

- int y=x; // error narrowing

- int y=(int)x; // typecasting

### NARROWING AND WIDENING:

    ----------------------

- NARROWING: big data type to small (not supported in java )
- WIDENING: small data tyep to big data type (supported by default)

##### COMMENTS IN JAVA:

     ------------------

- SINGLE LINE COMMENT : // comment

- BLOCK / MULTILINE COMMENT: /_ comment _/

- DOCUMENT COMMENT: /\*_ comment _/ : helps in documentation of code and there is a program named `javadoc` which do documentation of code automatically for dev.
