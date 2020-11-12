// final instance variables.

// 1. while decalaring.
class A{

final int a=10;
final int b;
final int c;

// 2 . using constructor.
A(){

    b=20;
}



// 3. using initialization block

{

    c=30;
    
}

}


// final static

class B{

    final static int d=10; // while decalartion.
    final static int e;
    
    static   // inside a static block
    {

        e=50;

    }


}

// final local variable

class C{

    static void f3(){
        final float PI=3.14f; // only at the time of declaration
        System.out.println(PI);

    }

}
// final method cannot be overided.
class D{

    final void f2(){

        System.out.println("D f2 parent");
    }

}
class E extends D{

    // final void f2(){   // error final method cannot be overided.

    //     System.out.println("E f2 child");
    // }

    final void f2(int a){

        System.out.println("E f2 child paramterized overloaded");
    }
}
// final class


final class F{



}


// class G extends F{  //   error: final class cannot be inherited.



// }


class Final{

public static void main(String[] args){

        A aref=new A();
        System.out.println(aref.a);
        System.out.println(aref.b);
        System.out.println(aref.c);
        
        B bref=new B();
        System.out.println(B.d);
        System.out.println(bref.e);
        
        C.f3();

        D dref=new D();
        dref.f2();


        E eref= new E();
        eref.f2();
        eref.f2(10);

}


}