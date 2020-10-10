import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

//	Maximum Element
//        You have an empty sequence, and you will be given N commands. Each command is one of the following types:
//        •	"1 X" - Push the element X into the stack.
//        •	"2" - Delete the element present at the top of the stack.
//        •	"3" - Print the maximum element in the stack.
//        Input
//        •	The first line of input contains an integer N, where 1 ≤ N ≤ 105
//        •	The next N lines contain commands. All commands will be valid and in the format described
//        •	The element X will be in range 1 ≤ X ≤ 109
//        •	The type of the command will be in range 1 ≤ Type ≤ 3
//        Output
//        •	For each command of type "3", print the maximum element in the stack on a new line.
//
//         Input
//        9
//        1 97
//        2
//        1 20
//        2
//        1 26
//        1 20
//        3
//        1 91
//        3

//        Output
//	      26
//        91


public class Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (Integer.parseInt(input[0]) == 1){
                stack.push(Integer.parseInt(input[1]));
            }else if (Integer.parseInt(input[0]) == 2){
                stack.pollFirst();
            }else if (Integer.parseInt(input[0]) == 3){
                System.out.println(Collections.max(stack));
            }
        }
    }
}
