package constructor;

public class StudentsTester {
    public static void main(String[] args) {
        Students student1 = new Students("John",60,50,90);
        Students student2 = new Students("Mina",50,50,70);
        Students student3 = new Students("Mohamed",60,50,90);
        Students student4 = new Students("George",60,40,80);
        Students student5 = new Students("Marco",60,60,90);

        System.out.println("Final grade for "+student1.name+" is "+student1.gradesAverage());
        System.out.println("Final grade for "+student2.name+" is "+student2.gradesAverage());
        System.out.println("Final grade for "+student3.name+" is "+student3.gradesAverage());
        System.out.println("Final grade for "+student4.name+" is "+student4.gradesAverage());
        System.out.println("Final grade for "+student5.name+" is "+student5.gradesAverage());
    }
}
