package constructor;

class Task {
    /*Write a java class that have 4 constructors with 4 different access levels of
     constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */
 String name;
 double weight;
int age;
char grade;
private Task(String fName){name=fName;}
public Task(double personWeight){weight=personWeight;}
  Task(int personAge) {age = personAge;}
  protected Task(char personGrade) {grade = personGrade;}


     public static void main(String[] args) {
         Task example1= new Task("Mina");
         System.out.println(example1.name);
         Task example2= new Task(70.98);
         System.out.println(example2.weight);
         Task example3= new Task(57);
         System.out.println(example3.age);
         Task example4= new Task('A');
         System.out.println(example4.grade);






     }







 }