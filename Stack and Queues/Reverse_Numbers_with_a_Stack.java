import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> listDeque = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" +"))
                .forEach(listDeque::push);

        while (!listDeque.isEmpty()) {
            System.out.print(listDeque.pop() + " ");
        }
    }
}
