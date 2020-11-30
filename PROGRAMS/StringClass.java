






class StringClass{


    public static void main(String[] args){

        String s ="Hello How are you?";
        String sm ="Hello How are you?";

        // the reference in sm and s will be same.

        System.out.println(sm==s);

        String new_s = new String("Hello How are you?");
        String new_sm = new String("Hello How are you?");

        // now the references will be different.


        System.out.println(new_sm==new_s);


        // some common used methods of String class.

        int len = s.length();


        int indexOfE = s.indexOf('e'); // 1

        int lastIndexOfE = s.lastIndexOf('e');  // 12


        boolean equalsTo = s.equals(sm);  // true

        System.out.println(equalsTo+ " " +lastIndexOfE + " "+indexOfE);


        System.out.println("Hello".equalsIgnoreCase("heLLo"));

        char ch[] = new char[s.length()];

        ch  = s.toCharArray();


        System.out.println(ch instanceof char[]);


        System.out.println("Amar".compareTo("Amit"));  // difference of ascii value a - i = -

        System.out.println("Amar".replace('a','i'));  // replace returns the String.









    }




}