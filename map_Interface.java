import java.util.*;

public class map_Interface {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
//        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.containsKey("One"));
        System.out.println(map.containsValue(6));

    }
}
