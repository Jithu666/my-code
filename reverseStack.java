import java.util.*;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(9);
        st.push(8);
        st.push(7);
        st.push(6);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

//        System.out.println(st.pop());
//        System.out.println(st.peek());
        System.out.print("Original Stack : ");
        printStack(st);
//
        reverseStack(st);

        System.out.print("Reversed Stack : ");
        printStack(st);
    }

    static void reverseStack(Stack<Integer> st){
        if(!st.isEmpty()){
           int temp = st.pop();

           reverseStack(st);

           insertAtBottom(st, temp);
        }
    }

    private static void insertAtBottom(Stack<Integer> st, int temp){
        if(st.isEmpty()){
            st.push(temp);
        }else{
            int element = st.pop();

            insertAtBottom(st, temp);

            st.push(element);
        }
    }

    public static void printStack(Stack<Integer> st){
        for(int element : st){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}