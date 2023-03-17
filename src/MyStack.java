import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {

        /// đảo ngược phần tử trong mảng số ngyên sử dụng Stack
//        Stack<Integer> stack = new Stack<Integer>();

//        int[] array = {1, 2, 3, 4, 5};
//
//        System.out.println("mảng ban đầu --->");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(stack.push(array[i]));
//        }
//        System.out.println("");
//        System.out.println("sauu khi đảo ngược ---> ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] = stack.pop());
//        }

        /// đảo ngược chuỗi sử dụng Stack

        Stack<String> wStack = new Stack<>();
        String mWord = "mot,hai,ba,bon";
        String[] array = mWord.split(",");
        System.out.println("Kết quả: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.print(wStack.push(array[i]));
        }
        System.out.println("");
        System.out.println("sauu khi đảo ngược ---> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] = wStack.pop());
        }
    }
}
