public class Student2 {
    /*Write a Student class that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
     */
String name ;
String address;
Student2(String studentName, String studentAddress){
    name=studentName;
    address=studentAddress;

}
void studentdisplayinfo(){
    System.out.println("Student Name is "+name+" and student address is "+address);
}

    public static void main(String[] args) {
        Student2 example1 = new Student2("Mina","135 Main St, Texas,USA");
        example1.studentdisplayinfo();
    }

}
