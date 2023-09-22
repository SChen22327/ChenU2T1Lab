public class Student {
    private String name;
    private int year;
    public Student(String studentName, int studentYear) {
        name = studentName;
        year = studentYear;
    }
    public void introduction() {
        System.out.println("Hi, my name is " + name + " and I am in grade " + year + ".");
    }
    public void studentInfo() {
        System.out.println("Name: " + name + "\nGrade: " + year);
    }
}
