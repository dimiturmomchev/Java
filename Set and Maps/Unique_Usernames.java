import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
//	Unique Usernames
//        Write a simple program that reads from the console a sequence of usernames
//        and keeps a collection with only the unique ones.
//        Print the collection on the console in order of insertion:
//
//        Input
//        6
//        Ivan
//        Ivan
//        Ivan
//        SemoMastikata
//        Ivan
//        Hubaviq1234

//        Output
//        Ivan
//        SemoMastikata
//        Hubaviq1234

public class Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> usernames = new LinkedHashSet<>();

        while (n-- >0){
            String username = scanner.nextLine();
            usernames.add(username);
        }

        usernames.forEach(e->{
            System.out.println(e);
        });
    }
}
