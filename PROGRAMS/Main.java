class Constructor01{


    private int a;
    private int b;


    private Constructor01(){

        

    }


   static Constructor01 setInstance(int a,int b){

        Constructor01 obj = new Constructor01();
        obj.a = a;
        obj.b = b;
        return obj;
    }

    int getA(){

        return a;
    }

    int getB(){ return b;}
    
    Constructor01(Constructor01 c){

        a=c.a;
        b=c.b;

    }
}


class Main{

    public static void main(String[] args){

        Constructor01 c1 = Constructor01.setInstance(10,20);
        System.out.print("a:"+c1.getA()+" b:"+c1.getB());
        
        Constructor01 c2 = new Constructor01(c1);
        System.out.print("a:"+c2.getA()+" b:"+c2.getB());

    }


  
}