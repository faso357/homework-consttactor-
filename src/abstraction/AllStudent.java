package abstraction;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public class AllStudent {
    void studyHard(){
        System.out.println("Study everyday hard");
    }
    void practice(){
        System.out.println("Practice everyday");
    }
    void doHomeWork(){
        System.out.println("Do homework after the class");
    }
}
class SyntaxStudent extends AllStudent{
    @Override
    void studyHard() {
        System.out.println("SyntaxStudent study hard");
    }
    void workout(){
       System.out.println("SyntaxStudent workout ");
   }
    }

class CollageStudent extends AllStudent{
    @Override
    void practice() {
        System.out.println("practice well");
    }
void StayCollage(){
    System.out.println("College Student stay at college");
}

    }

class SchoolStudent extends AllStudent{
    @Override
    void doHomeWork() {
        System.out.println("Homework solving ");
    }
    void StayHome(){
        System.out.println("SchoolStudent stay at home ");
    }

    public static void main(String[] args) {
        AllStudent[] students={new SyntaxStudent(),new CollageStudent(),new SchoolStudent()} ;
        for(AllStudent student:students){
            student.doHomeWork();
            student.practice();
            student.studyHard();

        }
    }
}