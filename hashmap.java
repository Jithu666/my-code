import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();

        hm.put("Jithu", 21);
        hm.put("Anant", 24);
        hm.put("Pramod", 23);
        hm.put("Vikas", 24);
        hm.put("Kristen", 22);
        hm.put("Rishab", 22);

        int jithu_s_age = hm.get("Jithu");
        System.out.println("Jithu's Age is : " + jithu_s_age);

        boolean containsAnant = hm.containsKey("Anant");
        System.out.println(containsAnant);

        hm.remove("Pramod");
        System.out.println(hm);

//        for (Map.Entry<String, Integer> entry : hm.entrySet()){
//            System.out.println("Name " + entry.getKey() + " Age : " + entry.getValue());
//        }

        hm.forEach((name, age) -> System.out.println("Name is " + name + " & Age is " + age));
    }
}
