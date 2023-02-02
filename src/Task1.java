public class Task1 {
    /*Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
String name;
String id;
double weight;
int age;
Task1(String studentName,String studentId,double studentWeight,int studentAge){
    name=studentName;
    id=studentId;
    weight=studentWeight;
    age=studentAge;
}


    public static void main(String[] args) {
        Task1 mina = new Task1("Mina","jh87",100,34);
        Task1 Fady = new Task1("Fady","65yt",90,37);
        Task1 mohamed = new Task1("Mohamed","jg76",100,30);



}}