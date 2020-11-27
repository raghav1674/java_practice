import java.util.Scanner;

class ExceptionClass{


    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);

    try{
        a = sc.nextInt();
        b = sc.nextInt();
    


    c = a/b;  // run time error can occur in this line. and the DEH will execute and terminate the program
    System.out.println(c);
    }
    catch(ArithmeticException e){


        System.out.print(e.getMessage());  // getMessage to print the error message of the obect thrown even expection came.

    }
    catch(Exception e){ // Exception is the parent class of all Runtime Exceptions.

        System.out.println(e);

      // will clean the buffer

    } 
    finally{
        // it will run always 
           String s = sc.nextLine();
    }  
                            // if try block is ther then catch or finally block should be there,

    a = sc.nextInt(); // if string input given then error thrown upper and the next input is not taken as the data is there in the buffer.
    b = sc.nextInt();   // (inputMisMatchException )
    c = a +b;

    System.out.println(c);




    }






}