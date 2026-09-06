import java.io.*;
import java.util.Scanner;

public class StudentFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            FileWriter fw = new FileWriter("student.txt");

            fw.write("Student ID: " + id + "\n");
            fw.write("Student Name: " + name + "\n");
            fw.write("Course: " + course + "\n");
            fw.write("Marks: " + marks + "\n");

            fw.close();

            System.out.println("\nData written successfully.");

            System.out.println("\nReading data from file:");
            System.out.println("-----------------------");

            BufferedReader br = new BufferedReader(
                    new FileReader("student.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}