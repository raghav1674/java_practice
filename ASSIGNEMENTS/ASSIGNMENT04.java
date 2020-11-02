import java.util.Scanner;

//q2: 
class Rectangle{

    int length;
    int breadth;

    int calArea(int l,int b){
        return l*b;
    }
}


//q3:
class Circle{

    static float PI=3.14f;
    int radius;

    float calArea(int r){

        return (r*r*PI);
    }

}



class ASSIGNMENT04{

 //Q1:  
  static int  calSquare(int n){

    return n*n;
  }

  //q4:
  static float average(float a,float b,float c){

    return(a + b + c)/3;
  }

  //q6:
  static int  getMiddleElement(int a,int b,int c){

    int middle;

    if(a<b && b<c&&a<c){

        middle=b;

    }
    else if(b<a && a<c && b<c)
    {
        middle=a;
    }
    else{

        middle=c;
    }


    return middle;

  }


  //q5:
  static float calSI(float principle,float rate,float time){

            return (principle*rate*time)/100;
  }
   public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    //q1:
//     int number=0;
//     if(input.hasNextInt())
//         number=input.nextInt();
//     System.out.println("Square of "+number+" is "+calSquare(number)+".");
      
//    }

   //Q2:
    // Rectangle rec = new Rectangle();
    
    // System.out.println("Enter the length: ");
    
    // if(input.hasNextInt())
    //     rec.length = input.nextInt();
   
    // System.out.println("Enter the breadth: ");
    
    // if(input.hasNextInt())
    //     rec.breadth=input.nextInt();
    
    // System.out.println("Area of rectangle is "+rec.calArea(rec.length,rec.breadth)+" units.");
    
    
    //q3:
    // Circle c = new Circle();
    
    // System.out.println("Enter the radius: ");
    
    // if(input.hasNextInt())
    // c.radius = input.nextInt();
    
    // System.out.println("Area of circle is "+c.calArea(c.radius)+" sq. units.");
    
    
    
    //q4:
    // float a=0f,b=0f,c=0f;
    
    // System.out.println("Enter the three numbers: ");

    // if(input.hasNextFloat()){
        
    //     a=input.nextFloat();
        
    //     if(input.hasNextFloat())
    //         b=input.nextFloat();
       

    
    //     if(input.hasNextFloat())
    //         c=input.nextFloat();
       

    // }
    // float avg = average(a ,b,c);
    // System.out.printf("The Average of the given three numbers is %.2f",avg);


    
    
    //q5:
//      float principle=0f,rate=0f,time=0f;
    
//     System.out.println("Enter the principle amount , rate and time: ");

//     if(input.hasNextFloat()){
        
//         principle=input.nextFloat();
        
//         if(input.hasNextFloat())
//             rate=input.nextFloat();
       

    
//         if(input.hasNextFloat())
//             time=input.nextFloat();
       

//     }

//     System.out.println("The simple interest is "+calSI(principle,rate,time));

// }


     //q6:
//    int a=0,b=0;
//    if(input.hasNextInt()){
//        a=input.nextInt();

//         if(input.hasNextInt())
//             b=input.nextInt();
//         }
//     System.out.println("Before swapping a: "+a+" b: "+b);
//    a = b-a+(b=a);
//    System.out.println("After swapping a: "+a+" b: "+b);

//q7:

   System.out.println("Middle Element of 1,2,3 is: "+getMiddleElement(21,221,3));
}
}