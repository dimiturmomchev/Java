import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
//	Count Symbols
//  Write a program that reads some
//  text from the console and counts
//  the occurrences of each character in it.
//  Print the results in alphabetical (lexicographical) order. 4.

//  Input -- Did you know Math.Round rounds to the nearest even integer?


public class Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<Character, Integer> characterWithOccurences =  new TreeMap<>();

        for (char symbol : input.toCharArray()) {
            characterWithOccurences.putIfAbsent(symbol,0);
            characterWithOccurences.put(symbol,characterWithOccurences.get(symbol)+1);
        }

       System.out.println(characterWithOccurences.entrySet()
                .stream()
                .map(e-> String.format("%c - %d time/s",e.getKey(), e.getValue()))
                .collect(Collectors.joining(System.lineSeparator())));
    }
}
