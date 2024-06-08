import java.util.Stack;
public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "({}[]) ";
        boolean validparanthesis = validParanthesis(s);
        System.out.println(validparanthesis);
    }
    public static boolean validParanthesis(String s){
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '['){
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }
}
