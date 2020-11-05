
class Parent{

   private String name;
   private int age;
   public void setAge(int a){
       age=a;
   }
   public void setName(String b){
       name =b;
   }
   int getAge(){

    return age;
   }
   String getName(){

    return name;
   }




}

class Child extends Parent{

    private int money;
    void setMoney(int m){ money=m;}
    int getMoney(){return money;}
}

class Inheritance{


    public static void main(String[] args){

        Child c = new Child();
        c.setAge(10);
        c.setName("Raj");
        c.setMoney(10000);
        System.out.println("NAME: "+c.getName()+" "+"AGE: "+c.getAge()+" "+" Money:"+c.getMoney());
    }
}