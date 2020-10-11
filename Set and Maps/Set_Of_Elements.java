import java.util.LinkedHashSet;
import java.util.Scanner;


//	Sets of Elements
//        On the first line you are given the length of two sets n and m.
//        On the next n + m lines there are n numbers that are in the first
//        set and m numbers that are in the second one. Find all non-repeating
//        element that appears in both of them, and print them in same order at the console:
//        Set with length n = 4: {1, 3, 5, 7}
//        Set with length m = 3: {3, 4, 5}
//        Set that contains all repeating elements -> {3, 5}
//        Examples

//        Input
//        4 3
//        1
//        3
//        5
//        7
//        3
//        4
//        5
//        Output
//        3 5

public class Set_Of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] token = scanner.nextLine().split(" ");

        int setOneLength =Integer.parseInt(token[0]);
        int setTwoLength =Integer.parseInt(token[1]);

        LinkedHashSet<Integer> setOne = new LinkedHashSet<>();
        LinkedHashSet<Integer> setTwo = new LinkedHashSet<>();

        for (int i = 0; i < setOneLength; i++) {
            setOne.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < setTwoLength; i++) {
            setTwo.add(Integer.parseInt(scanner.nextLine()));
        }

        setOne.forEach(e->{
            if (setTwo.contains(e)){
                System.out.print(e+" ");
            }
        });



    }
}
