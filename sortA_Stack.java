import java.util.*;

public class sortA_Stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(4);
        stack.push(0);
        stack.push(9);
        stack.push(12);
        stack.push(17);
        stack.push(1);
        stack.push(2);


        System.out.println("Stack before sorting : ");
        printStack(stack);

        sortAStack(stack);

        System.out.println("Stack after sorting : ");
        printStack(stack);

    }

    public static void sortAStack(Stack<Integer> stack) {

        if (!stack.isEmpty()) {
            int temp = stack.pop();

            sortAStack(stack);

            sortForSmallerInput(stack, temp);
        }
    }
       private static void sortForSmallerInput(Stack<Integer> stack, int temp){
        if(stack.isEmpty() || temp > stack.peek()){
            stack.push(temp);
        }else{
            int element = stack.pop();

            sortForSmallerInput(stack, temp);

            stack.push(element);
        }
    }


    static void printStack(Stack<Integer> stack){
        for(int element : stack){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
