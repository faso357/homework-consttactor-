package constructor;

public class Tasktester {
    public static void main(String[] args) {
        //Task example1= new Task("Mina");
       // System.out.println(example1.name);
        Task example2= new Task(70.98);
        System.out.println(example2.weight);
        Task example3= new Task(57);
        System.out.println(example3.age);
        Task example4= new Task('A');
        System.out.println(example4.grade);
    }
}
