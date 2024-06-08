import java.util.*;

public class deleteMiddleElementOfStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.print("Original Stack : ");
        printStack(st);

        deleteElement(st, st.size(), 0);

        System.out.print("Stack after deleting middle element : ");
        printStack(st);
    }

    static void deleteElement(Stack<Integer> st, int size, int current){

        if(st.isEmpty() || current == size/2){
            st.pop();
            return;
        }

        int temp = st.pop();

        deleteElement(st, size, current+1);

        st.push(temp);
    }

    static void printStack(Stack<Integer> st){
        for(int element : st){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}