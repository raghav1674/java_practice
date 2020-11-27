class Item{

    private int price;
    private String name;

    public Item(int price,String name){

        this.price = price;
        this.name = name;
    }

    public String toString(){
        return "[Item Object] Name: "+name+" Price: "+price;
    }

    public boolean equals(Item obj){

        if(price == obj.price && name==obj.name)
                return true;

        return false;
    }



    protected void finalize(){

        System.out.println("Item is destroyed.");
    }


}



class ObjectClass{


    public static void main(String[] args){

        // String s = new String("maggi");
        String s="maggi";
        Item i1 = new Item(10,"maggi");
        i1 = new Item(10,"hh");
       
        System.out.println(i1.toString());
        // System.out.println(i1.equals(i2));

        


    }


}