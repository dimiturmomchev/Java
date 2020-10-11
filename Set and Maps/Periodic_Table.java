import java.util.*;


//Periodic Table
//        You are given an n number of chemical compounds.
//        You need to keep track of all chemical elements
//        used in the compounds and at the end print all unique
//        ones in ascending order:
//        Examples

//        Input
//        3
//        Ge Ch O Ne
//        Nb Mo Tc
//        O Ne

//        Output
//        Ch Ge Mo Nb Ne O Tc

public class Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> compounds = new TreeSet<>();
        while (n--> 0){
           compounds.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        }

        System.out.println(compounds);

    }
}
