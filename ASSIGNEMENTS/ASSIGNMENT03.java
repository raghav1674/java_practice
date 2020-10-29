
//Q1:
class Account{

    float balance;
    String customerName;
    String accountNumber;
    static float rateOfInterest;

    static void getROI(){

        System.out.println("ROI: "+rateOfInterest);
    }

    static void setROI(float roi){

        rateOfInterest = roi;

    }

    void setAccountDetails(float bal,String name,String accountNo){

        balance = bal;
        customerName = name;
        accountNumber = accountNo;
        
    }


    void getAccountDetails(){

        System.out.println("ACCOUNT DETAILS");
        System.out.println("ACCOUNT NUMBER: "+accountNumber);
        System.out.println("CURRENT BALANCE: "+balance);
        System.out.println("CUSTOMER NAME: "+ customerName);
        
        
    }
}


//Q2:
class Sum{

    static String  addIntegers(String firstNumber,String secondNumber){

        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);
        int sum = first+second;
        String result = String.valueOf(sum);
        return result;
     

    }
}

//Q3:
class SumCmd{

    static int sumFromCmd(String cmdArray[]){
        int sum=0;
        for(int i=0;i<cmdArray.length;i++)
            sum+=Integer.parseInt(cmdArray[i]);

        return sum;
    }
 
}

//Q4:
class PrintCityNames{

    static void printCityNames(String[] cmdCityNames){

        for(int i=0;i<cmdCityNames.length;i++)
            System.out.println(cmdCityNames[i]);
    }
}


class ASSIGNMENT03{


    public static void main(String[]args){

            //Q1:
        // Account rbi = new Account();
        // Account.setROI(1.2f);
        // rbi.getROI();
        // rbi.setAccountDetails(10000.0f,"Ram","1ABC0000XS");
        // rbi.getAccountDetails();

        // //Q2:
        // String firstNumber = "10";
        // String secondNumber ="20";
        // String result= Sum.addIntegers(firstNumber,secondNumber);
        // System.out.println("The Sum of "+firstNumber+" and "+secondNumber+" is "+result);

        //Q3:
        // int result = SumCmd.sumFromCmd(args);
        // System.out.println("Sum is: "+result);

        //Q4:
        // PrintCityNames.printCityNames(args);


    }
}