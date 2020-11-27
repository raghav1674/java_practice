
// q1:
interface Convertable{


    int KM_TO_M = 1000;
    int M_TO_CM = 100;
    int CM_TO_MM = 10;


}

class Converter implements Convertable{


    public double killoMeterToMeter(double distanceKilloMeter){

        return KM_TO_M*distanceKilloMeter;
    }

    public double meterToCentiMeter(double distanceMeter){

        return M_TO_CM*distanceMeter;
    }

    public double centiMeterToMilliMeter(double distanceCentiMeter){

        return CM_TO_MM*distanceCentiMeter;
    }




}

// q2:
abstract class Shape{

    abstract double getArea();
    abstract String getName();
}

class Circle extends Shape{

    private final static double PI=3.14;
    private int radius;

    Circle(int radius){ this.radius = radius;}

    double getArea(){ return PI*radius*radius;}

    String getName(){ return "Circle";}

}

class Square extends Shape{

    private double side;

    Square(double side){this.side = side;}

    double getArea(){ return side*side;}

    String getName(){ return "Square";}



}

class Triangle extends Shape{

    private int sideOne,sideTwo,sideThree;

    Triangle(int sideOne,int sideTwo,int sideThree){ 

        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    double getArea(){ 

        double semiPerimeter = (sideOne + sideTwo +sideThree)/2.0;

        return Math.sqrt(semiPerimeter*(semiPerimeter-sideOne)*(semiPerimeter-sideTwo)*(semiPerimeter-sideThree));
    }

    String getName(){ return "Triangle";}
}


// q3:

abstract class Employee{

    String name;
    String designation;
    double bonus;
    double salary;
    double commission;


    Employee(String name,String designation,double salary){ // we can have constructor and this and super in abstract classes.

        this.name=name;
        this.designation=designation;
        this.salary =salary;
    }

    

    public String getName(){ return name;}
    public double getSalary(){ return salary;}
    public String getDesignation(){ return designation;}
    public double getBonus( ){return bonus;}
    public double getCommission(){ return commission;}
    abstract public double totalIncome();


}

class Manager extends Employee{



    Manager(String name,String designation,double salary,double commission,double bonus){

        super(name,designation,salary);
        this.commission = commission;
        this.bonus= bonus;



    }


    public double totalIncome(){ return bonus + commission + salary;}




}

class SalesMan extends Employee{


    SalesMan(String name,String designation,double salary,double commission){


        super(name,designation,salary);
        this.commission = commission;
    }

    public double totalIncome(){ return salary + commission;}


    
}



class Developer extends Employee{


    Developer(String name,String designation,double salary,double bonus){


        super(name,designation,salary);
        this.bonus = bonus;
    }

    public double totalIncome(){ return bonus + salary;}


    
}


// q4: 

abstract class Apartment{

    double lengthOne,widthOne,kitchenLength,kitchenArea,

    abstract public double getBedroom1Area(double length,double width);
    abstract public double getBedroom2Area(double length,double width);
    abstract public double getBedroom3Area(double length,double width);


    public double getKitchenArea(double length,double width){ return length*width;}


    public double getHallArea(double length,double width){ return length*width;}

    public abstract double getTotalArea();






}

class OneBHK extends Apartment{

    
    OneBHK(double length,double width){

        this.length = length;
        this.width = width;

    }

    public double getBedroom1Area(double length,double width){ return length*breadth;}
    public double getBedroom2Area(double length,double width){ return 0;}
    public double getBedroom3Area(double length,double width){ return 0;}


    public double getTotalArea(){ return getBedroom1Area() + getKitchenArea() };

}







class Assignment08{


    public static void main(String[] args){


        // Converter conv = new Converter();

        // System.out.println("1000 KM TO M : " + conv.killoMeterToMeter(1000) + "\n100 M TO CM: "+conv.meterToCentiMeter(100)+"\n10 CM TO MM: "+conv.centiMeterToMilliMeter(10) );


        // Shape shape[] ={new Circle(10),new Square(20),new Triangle(5,13,15) };

    


        // System.out.println("Shape: "+shape[0].getName() + " Area:" + shape[0].getArea());
        // System.out.println("Shape: "+shape[1].getName() + " Area:" + shape[1].getArea());
        // System.out.println("Shape: "+shape[2].getName() + " Area:" + shape[2].getArea());



        // Manager m = new Manager("Raghav","Software Engineer",10000,5000,1000);

        // System.out.println("Name: "+m.getName() + " Designation: "+m.getDesignation()+" TotalIncome: "+m.totalIncome());

        
        // SalesMan s = new SalesMan("Raghav","SalesMan",10000,5000);

        // System.out.println("Name: "+s.getName() + " Designation: "+s.getDesignation()+" TotalIncome: "+s.totalIncome());


        // Developer d = new Developer("Raghav","Python Dev",100000,5000);

        // System.out.println("Name: "+d.getName() + " Designation: "+d.getDesignation()+" TotalIncome: "+d.totalIncome());


    }
}