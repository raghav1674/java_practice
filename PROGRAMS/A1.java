package p1;
import p2.B1;
class A1{


    public static void f1(){

        System.out.println("p1 A1 f1");
    }

    public static void main(String[] args){

        f1();

        A2 a2 = new A2();
        a2.f2();

        B1 b1 = new B1();
        b1.f3();

        
    }
}

class A2{

    public void f2(){

        System.out.println("p1 A2 f2");
    }

}