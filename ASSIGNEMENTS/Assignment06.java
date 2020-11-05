class Complex{

    private int real;
    private int imag;

    Complex(){}

    private Complex(int r,int i){

        real=r;
        imag=i;
    }

    static Complex  setData(int r,int i){

        Complex c = new Complex(r,i);

        return c;
        



    }
    void showData(){

    System.out.print(real+" "+imag+" i");
    }

    int getReal(){ return real;}

    int getImg(){ return imag;}

     Complex add(Complex c2){

        
        Complex c = new Complex();
        c.real = real + c2.real;
        c.imag = imag + c2.imag;

        return c;

     }

     Complex multiply(Complex c2){

        Complex c = new Complex();
        c.real = real*c2.real + imag*c2.imag;
        c.imag = imag*c2.real + real*c2.imag;

        return c;

     }
}

// public class Assignment06{


//     public static void main(String[] args){

//         Complex c1 = Complex.setData(1,2);
//         Complex c2 = Complex.setData(2,1);

//         Complex c3 = c1.add(c2);

//         Complex c4 = c1.multiply(c2);


//         System.out.println("Sum is: "+c3.getReal()+" + "+c3.getImg()+"i");

        
//         System.out.println("Multiplication is: "+c4.getReal()+" + "+c4.getImg()+"i");


//     }
// }


//Q2:

class Box{

    private int length;
    private int breadth;
    private int height;


    private Box(){}

    private Box(int side){

        length=side;
        breadth=side;
        height=side;
    }
    private Box(int l,int b,int h){

        length=l;
        breadth=b;
        height=h;
        
    }

    static Box setDimension(int l,int b,int h){

        Box b1;
        if(l==b && b==h){

            b1 = new Box(l);
        }
        else{

            b1 = new Box(l,b,h);
        }

        return b1;

      
    }

    int getVolume(){

        return length*breadth*height;
    }

    void showDimensions(){
    
    
      System.out.print("Length: "+length+" Breadth: "+breadth+" Height: "+height);
    }


}

public class Assignment06{


    public static void main(String[] args){

        Box b1= Box.setDimension(1,1,1);
        Box b2 = Box.setDimension(1,2,3);

        System.out.println("Volume of cube is: "+b1.getVolume());
        System.out.println("Volume of cuboid is: "+b2.getVolume());


    }
}