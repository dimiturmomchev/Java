import java.util.Scanner;

//STUDENT DATABASE APPLICATION

// input :

// First Name : Martin
// Last Name : Georgiev
// Enter Student class level : 4
// Enter course to Enroll : History
// Enter course to Enroll : English
// Enter course to Enroll : Q
// Enter your payment: $200

public class StudentDataBaseapp {
    public static void main(String[] args) {
        // Ask how many new students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of students
        for (int i = 0; i < numOfStudents; i++) {
            students[i]= new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString());
        }
    }
}
