
class AreaCalculator{
    
    final private static double PI=3.14;
    
   
    
    int area(int r){ return (int)(PI*r*r);}
    
    
}

class Rectangle extends AreaCalculator{
    
    
    int area(int l,int h){
        
        return (l*h);
    }
    
   
}

class Triangle extends AreaCalculator{
    
    
    
    double area(int l,int h){
        
        return (1.0/2*(l*h));
    }
    
}


class A7_P2{



    public static void main(String[] args){

        Triangle ac = new Triangle();
	    System.out.println(ac.area(1));
	    Rectangle bc = new Rectangle();
	    System.out.println(bc.area(1,2));


    }
}