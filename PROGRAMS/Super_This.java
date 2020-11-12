class SimpleBox{

    private int length; 
    private int breadth; 
    private int height;
    
    SimpleBox(){

        System.out.println("Zero Argument SimpleBox Constructor");

    }
    SimpleBox(int length,int breadth,int height){
        
        // this is a local reference variable which points to the caller object.
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        System.out.println("Three Argument SimpleBox Constructor");
    }
    SimpleBox(int length){

        this.length=this.breadth=this.height=length;

        System.out.println("One Argument SimpleBox Constructor");
    }
    void getDimensions(){

        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Height: "+height);
    }
}
// Constructor Chaining:

class ColouredBox extends SimpleBox{


    private String color;
   
    ColouredBox(int length,int breadth,int height,String color){
       
        super(length,breadth,height);  // must be the first line 
        this.color=color;
        System.out.println("4 argument ColouredBox constructor");
        
    }

    ColouredBox(int length,String color){

        this(length,length,length,color);

        System.out.println("2 argument ColouredBox constructor");
        
        
    }
    ColouredBox(String color){
        
        super();
        this.color=color;
        System.out.println("1 argument ColouredBox constructor");
    }

    void getDimensions(){

     
        System.out.println("Colour: "+color);


    }
}




class Super_This{

    public static void main(String[] args){

            SimpleBox box = new SimpleBox(10,20,5);
            box.getDimensions();
            ColouredBox colorBox = new ColouredBox(10,"Orange");
            colorBox.getDimensions();
    }
}