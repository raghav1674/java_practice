import java.util.Scanner;


// q5:

class Product{

    private String productName;
    private int productPrice;

    void setName(String name){
        productName = name;
    }

    void setPrice(int price){

        productPrice = price;
    }

    String getName(){ return productName;}

    int getPrice(){ return productPrice;}




}





class ASSIGNMENT05{

    //Q1:
    static boolean isEvenOdd(int a){

        return (a%2==0)?true:false;
    }


    //Q2:
    static String isPosNegZero(int a){

        if(a<0)
            return "Negative";
        else if(a==0)
        
            return "Zero";
        else
            return "Positive";
    }

    //q3:
    static boolean isLeapYear(int year){

        return ((year%4 == 0) && (year%400==0 || year%100!=0))?true:false;

    }

    //q4:
     static int isGreatest(int a,int b,int c){

        if(a>c && a>b){

            return a;
        }
        else if(b>a && b>c){

            return b;
        }
        else if(c>a && c>b){

            return c;
        }
        else{

            return Integer.MAX_VALUE;
        }
     }

     //q5:
     static String isExpensive(Product p1,Product p2){


        return (p1.getPrice()>p2.getPrice())?p1.getName():p2.getName();



     }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        // int number1=0;
        // int number2=0;
        // int number3=0;
        // if(input.hasNextInt()){

        //     number1=input.nextInt();
        //     if(input.hasNextInt()){

        //         number2=input.nextInt();
        //         if(input.hasNextInt()){

        //             number3=input.nextInt();
                    
        //         }
                
        //     }
           
            
        // }
        // if(isEvenOdd(number))
        //     System.out.println(number+" is Even.");
        // else
        // //     System.out.println(number+" is Odd.");
        // System.out.print(number+" is "+isPosNegZero(number));

        //q3:
        // if(isLeapYear(number))
        //     System.out.print(number+" is a Leap year"); 
        // else
        //     System.out.print(number+" is not a Leap Year");


    //     // q4:
    //    if(isGreatest(number1,number2,number3)==Integer.MAX_VALUE)
    //             System.out.print("all numbers should be unique");
    //     else
    //         System.out.print(isGreatest(number1,number2,number3)+" is the greatest");



    // q5:

        Product Maggi=new Product();
        Maggi.setName("Maggi");
        Maggi.setPrice(12);
        Product Noodles=new Product();
        Noodles.setName("Noodles");
        Noodles.setPrice(10);

        System.out.print(isExpensive(Maggi,Noodles)+" is more expensive.");



    }
}