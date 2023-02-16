package constructor;

class Students {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
 String name;
 int grade1;
 int grade2;
 int grade3;

  Students(String studentName, int studentgrade1, int studentgrade2, int studentgrade3) {
    name = studentName;
    grade1 = studentgrade1;
    grade2 = studentgrade2;
    grade3 = studentgrade3;
}
    double gradesAverage() {
        return (grade1 + grade2 + grade3) / 3.0;

 }}






