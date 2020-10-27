//Q1:
class Box{

    int length;
    int breadth;
    int height;

    void setDimensions(int l,int b,int h){

        length=l;
        breadth=b;
        height=h;
    }
    void getDimensions(){

        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("height: "+height);
    }

    //Q5:
    int calculateVolume(){

        return (length*breadth*height);
    }

}

//Q2:
class Employee{

    int employeeID;
    int salary;
    String name;
    String designation;


    void setDetails(int id,int sal,String n ,String desig){

        employeeID=id;
        salary=sal;
        name=n;
        designation=desig;
    }

    void getDetails(){

        System.out.println("Employee Details: ");
        System.out.print("Name: "+name+"\nID: "+employeeID+"\nSalary: "+salary+"\nDesignation: "+designation);
    }

}

//Q3:
class Book{

    int bookID;
    float price;
    String author;
    String publisher;
    String title;

    void setBookDetails(int id,String bookTitle,float bookPrice,String authorName,String publisherName ){

        bookID=id;
        price=bookPrice;
        author=authorName;
        price= bookPrice;
        title=bookTitle;
        publisher=publisherName;
    }
    void getBookDetails(){

        System.out.println("Book Details  ");
        System.out.println("Book Name:  "+title);
        System.out.println("Book ID:  "+bookID);
        System.out.println("Book Author:  "+author);
        System.out.println("Book Price:  "+price);
        System.out.println("Book Publisher:  "+publisher);

    }




}

//Q4:
class Student{

    int studentRollNo;
    int studentMobileNumber;
    int studentSemester;
    String studentName;
    String studentEmailAddress;


    void setStudentDetails(String Name,int rollNumber,int semester, int mobileNumber,String emailAddress){

          studentRollNo=rollNumber;
          studentName=Name;
          studentSemester=semester;
          studentMobileNumber=mobileNumber;
          studentEmailAddress=emailAddress;


    }
    void getStudentDetails(){

        System.out.println("Student Details  ");
        System.out.println("Student Name:  "+studentName);
        System.out.println("Student Roll Number:  "+studentRollNo);
        System.out.println("Student Semester:  "+studentSemester);
        System.out.println("Student Mobile Number:  "+studentMobileNumber);
        System.out.println("Student Email Address:  "+studentEmailAddress);

    }
}
class Assignment02{



    public static void main(String[] args){

        //Q1 AND 5:
        Box b1 = new Box();
        b1.setDimensions(10,20,4);
        b1.getDimensions();
        System.out.println("Volume of the box is :"+b1.calculateVolume());

        
        //Q2:

        Employee shyam = new Employee();
        shyam.setDetails(1,1200,"Shyam","Cloud Architect");
        shyam.getDetails();
        

        //Q3:

        Book dataStructures = new Book();
        dataStructures.setBookDetails(1,"DS ALGO",1000.00f,"Saurabh Shukla","MySirG");
        dataStructures.getBookDetails();
     
        //Q4:

        Student ashu = new Student();
        ashu.setStudentDetails("Ashutosh",11,7,01110201,"ashu@dif.com");
        ashu.getStudentDetails();
        
    }



}