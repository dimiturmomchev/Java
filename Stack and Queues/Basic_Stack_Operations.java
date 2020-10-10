import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//2.	Basic Stack Operations
//        You will be given an integer N representing the number of elements to push onto the stack,
//        an integer S representing the number of elements to pop from the stack and finally an integer X,
//        an element that you should check whether is present in the stack. If it is, print true on the console.
//        If it’s not, print the smallest element currently present in the stack.

//        Input
//        •	On the first line, you will be given N, S and X separated by a single space.
//        •	On the next line, you will be given a line of numbers separated by one or more white spaces.
//        Output
//        •	On a single line print either true if X is present in the stack otherwise print the smallest element in the stack.
//        •	If the stack is empty print 0.

//        Examples
//        Input	Output
//        5 2 13
//        1 13 45 32 4	true
//        4 1 666
//        420 69 13 666	13

public class Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNums = scanner.nextLine().split(" ");

        int stackNum = Integer.parseInt(inputNums[0]);
        int indexToPop = Integer.parseInt(inputNums[1]);
        int numToCheck = Integer.parseInt(inputNums[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < stackNum; i++) {
            stack.push(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < indexToPop; i++) {
            stack.poll();
        }

        if (stack.contains(numToCheck)){
            System.out.println("True");
        }else {
            System.out.println(Collections.min(stack));
        }



    }
}
