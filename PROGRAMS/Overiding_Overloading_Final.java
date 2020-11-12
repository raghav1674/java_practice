

class A{


  static void f3(){

    System.out.println("Static Base f3");

  }
  void f1(){

    System.out.println("Base f1");
  }

  void f2(){

    System.out.println("Base f2");
  }
  

}

class B extends A{

static void f3(int x){

    System.out.println("Static Child f3 int ");
}

static void f3(){

    System.out.println("Static Child f3");
}

 void f1(){  // Overriding


     System.out.println("Child f1");
 }

 void f2(int x){ // overloading 

    System.out.println("Child f2");
 }

}




public class Overiding_Overloading_Final{


    public static void main(String[] args){


        B bref = new B();

        bref.f1();  // Child f1. early binding

        A aref = new B(); // aref can only call the overridden member of the child B.

        aref.f1();  // Child f1  late binding by default in java.

        bref.f2(); // Base f2 // overloading 

        bref.f2(10);// Child f2 early binding

        aref.f2(); // Base f2 early binding

        // aref.f2(10); // error 

        aref.f3(); // Static Base f3 (method hiding.)

        bref.f3();// Static Child f3

        bref.f3(10); // Static Child f3 int
        
        
        // after commenting the f3 method in B,the static of A is called ie static method is also not hidden. ie no method hiding of static methods also.

        bref.f3();  // Static Base f3.

        aref.f1();
    }

}