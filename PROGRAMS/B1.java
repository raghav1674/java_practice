package p2;


public class B1{

    public void f3(){

        System.out.println("p2 B1 f3");

        B2.f4();  //static method;

        B2 b2= new B2();
        b2.f5();


    }
   


   

}

class B2{

    public static void f4(){

        System.out.println("p2 B2 f4");
    }
    
    public void f5(){
        
        System.out.println("p2 B2 f5");

    }

}