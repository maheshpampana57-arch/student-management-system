import java.util.*;

class Student {

    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return id + " | " + name + " | CGPA: " + cgpa;
    }
}

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("CGPA: ");
        double cgpa = sc.nextDouble();

        students.add(
            new Student(id, name, cgpa)
        );

        System.out.println("Student Added");
    }

    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students");
            return;
        }

        for (Student s : students)
            System.out.println(s);
    }

    static void searchStudent() {

        System.out.print("Enter ID: ");

        int id = sc.nextInt();

        for (Student s : students) {

            if (s.id == id) {

                System.out.println(s);

                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println(
"\n===== STUDENT MANAGEMENT =====");

            System.out.println(
"1.Add");

            System.out.println(
"2.View");

            System.out.println(
"3.Search");

            System.out.println(
"4.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    return;

                default:
                    System.out.println(
"Invalid");
            }
        }
    }
}
