

class A implements Runnable{

    public void run(){

        f1();
        f2();

    }

    public void f1(){

        System.out.println(Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());

        for(int i=1;i<10;i+=2)System.out.println("i ="+i);
    }
     public void f2(){

          System.out.println(Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());

        for(int j=0;j<10;j+=2){
            
            if(j==4) throw new ArithmeticException("A "+Thread.currentThread().getName()+" got terminated.");
            System.out.println("j ="+j);


        }
    }
}


class B extends Thread{


    B(String s){ super(s);}
    public void run(){ f2();}

    public void f2(){

        System.out.println(Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());

        for(int b=0;b<10;b++)System.out.println("b ="+b);

    }
}


class ThreadRunnable{


    public static void main(String[] args){

        A a = new A();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);

        t1.start();
        t2.start();


        B b = new B("MyBThread");
        b.start();



    }
}