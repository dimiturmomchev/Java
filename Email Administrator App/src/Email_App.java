import java.util.Scanner;

public class Email_App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        System.out.println("Enter your First Name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter your Last Name: ");
        lastName = scanner.nextLine();

        Email em1 = new Email(firstName,lastName);

        System.out.println(em1.showInfo());
    }
}
