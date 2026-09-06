package studentmanagement;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Himanshu", "Computer Engineering");

        System.out.println("Student Details");
        System.out.println("----------------");

        s1.display();
    }
}