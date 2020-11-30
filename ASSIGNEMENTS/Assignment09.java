
import java.util.Scanner;












class Assignment09{

    // q1:
    static void countChars(String input){


        int num_count=0,num_alpha=0,num_special=0;

        for(int i=0;i<input.length();i++){

            char s = input.charAt(i);
            if(s>=48 && s<=57) num_count++;
    
            else if((s>='a' && s<='z') || (s>='A' && s<='Z')) num_alpha++;

            else num_special++;
        }

        System.out.println("Numbers: "+num_count+"\nAlphabets: "+num_alpha+"\nSpecial: "+num_special);
    }

    //q2:

    static void dupFreq(String input){

        String inputUpper = input.toUpperCase();

       int  sc[] = new int[26];

       for(int i=0;i<inputUpper.length();i++){

           if(inputUpper.charAt(i)>='A' && inputUpper.charAt(i)<='Z'){
           int asciiMinusA = inputUpper.charAt(i) - 'A'; // as 'A'=65 and 'A'-'A'==0

           

           sc[asciiMinusA]++;
           }
       }
        for(int i=0;i<26;i++){

            if(sc[i]>1){

                char s = (char)(i+'A'); // 'A'+1 =(char)66 == 'B'
                System.out.println(s+": "+sc[i]);
            }
        }

       
        


    }

    //q4:
      


    //q5:
    static boolean isAnagram(String s1,String s2){

        if(s1.length()!=s2.length())return false;

        int sum=0;
        for(int i=0;i<s1.length();i++){

            sum+=s1.charAt(i);
            sum-=s2.charAt(i);
        }

        if(sum==0)return true;
        return false;

        
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        // dupFreq(input);

        System.out.println("anaa  and  naa is anagram: "+isAnagram("anaa","bnaa"));

        

    }

}