class WExample{

        public static void main(String[] args) {

            Integer firstValue = new Integer(10);

            Integer secondValue = new Integer("20");

            String number = "100";

            int parsedInt = Integer.parseInt(number);

            Integer intRef = Integer.valueOf(number,2);

            Integer sum = firstValue + secondValue;

            int toInt = intRef.intValue();


            System.out.println("firstValue: "+firstValue);
            System.out.println("secondValue: "+secondValue);
            System.out.println("sum: "+sum);
            System.out.println("intRef : "+intRef);
            System.out.println("parsedInt: "+parsedInt);
            System.out.println("toInt: "+toInt);
           


        }





}