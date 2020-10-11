import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Phonebook
//        Write a program that receives some info from the console about people and their phone numbers.
//        You are free to choose the manner in which the data is entered; each entry should have just one name and one number
//        (both of them strings). If you receive a name that already exists in the phonebook, simply update its number.
//        After filling this simple phonebook, upon receiving the command "search", your program should be able to perform a
//        search of a contact by name and print her details in format "{name} -> {number}". In case the contact isn't found, print "Contact {name} does not exist."
//        Examples:
//
//        Input
//        RoYaL(Ivan)-666
//        Gero-5559393
//        Simo-02/987665544
//        search
//        Simo
//        simo
//        RoYaL
//        RoYaL(Ivan)
//        stop



public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        Pattern pat = Pattern.compile("(.+)-(.+)");

        HashMap<String,String > map = new HashMap<>();

        while(!(input = scanner.nextLine()).equals("search")){
            Matcher matcher = pat.matcher(input);
            if(matcher.find()) {
                map.put(matcher.group(1), matcher.group(2));
            }
        }
        while(!(input= scanner.nextLine()).equals("stop")){
            if(map.containsKey(input)){
                System.out.format("%s -> %s\n",input,map.get(input));
            }else{
                System.out.format("Contact %s does not exist.\n",input);
            }
        }
    }
}
