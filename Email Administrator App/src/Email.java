import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 0;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        Scanner scanner = new Scanner(System.in);   
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Enter your Email Capacity");
                int emailCapacity = Integer.parseInt(scanner.nextLine());
                System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
                setMailBoxCapacity(emailCapacity);
        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return " acct";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    // Set the alternative email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "\n"+"DISPLAY NAME: "+ firstName +" "+ lastName + "\n"+
                "COMPANY EMAIL: "+ email + "\n"+
                "MAILBOX CAPACITY: " +mailBoxCapacity +"mb";
    }
}
