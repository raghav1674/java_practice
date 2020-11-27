import java.util.Scanner;

// q1:
class Person{

    private String name;
    private int age;

    void setAge(int age){this.age=age;}
    
    
    void setName(String name){this.name=name;}

    int getAge(){return age;}

    String getName(){return name;}

    void display(){

        System.out.println("Name: "+name+" Age: "+age);
    }

}

class Student extends Person{

    int rollNumber;

    void setRollNumber(int rollNumber){ this.rollNumber =rollNumber;}
    int getRollNumber(){ return rollNumber;}

    void display(){

        System.out.println("Name: "+getName()+" Age: "+getAge() + " RollNumber "+rollNumber);
    }
}

// q2:
class AreaCalculator{

    private final static double PI;

    static{

        PI=3.14;
    }

    double calculateArea(int radius){  return PI*radius*radius;}


    double calculateArea(int length,int breadth){  return length*breadth;}
    
    
    double calculateArea(int sideOne,int sideTwo , int sideThree){ 


        double semiPerimeter = (sideOne + sideTwo  + sideThree)/2.0;

        System.out.println(semiPerimeter);

        return Math.sqrt(semiPerimeter*(semiPerimeter-sideOne)*(semiPerimeter-sideTwo)*(semiPerimeter-sideThree));
    }
}


class Assignment07{

    public static void main(String[] args){

        // Student ram = new Student();

        // ram.setName("Ram");
        // ram.setAge(18);
        // ram.setRollNumber(1);

        // ram.display();

        AreaCalculator ar = new AreaCalculator();

        System.out.println(ar.calculateArea(1));

        System.out.println(ar.calculateArea(2,3));

        System.out.println(ar.calculateArea(4,13,15));
        



    }
}