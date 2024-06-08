import java.util.*;

//    DONE USING BIT MANIPULATION

public class printAllSubsequences {
//    public static void main(String[] args) {
//
//        String s = "ab";
//        ArrayList<String> ans = allPossibleSubsets(s);
//
//        System.out.println("All possible subsequences are : ");
//        for(String var : ans){
//            System.out.print(var + " ");
//        }
//    }
//
//    static ArrayList<String> allPossibleSubsets(String s){
//        int n = s.length();
//        ArrayList<String> ans = new ArrayList<>();
//        for(int i = 0; i < (1 << n); i++){
//            String sub = "";
//            for(int j = 0; j < n; j++){
//                if((i & (1 << j)) != 0){
//                    sub += s.charAt(j);
//                }
//            }
//            if(sub.length() > 0){
//                ans.add(sub);
//            }
//        }
//        Collections.sort(ans);
//        return ans;
//    }
//}
//
//
//  DONE USING RECURSION(BACKTRACKING)

    public static void main(String[] args) {
        String s = "abc";
        String f = "";
        subArray(0, s, f);
    }
    static void subArray(int i, String s, String f){
        if(i == s.length()){
            System.out.print(f + " ");
            return;
        }
        subArray(i + 1, s, f+s.charAt(i));
        subArray(i + 1, s, f);
    }
}