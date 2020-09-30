import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("A: " + map.get("A"));
        System.out.println("B: " + map.get("B"));
        System.out.println("C: " + map.get("C"));
        System.out.println("Size: " + map.size());
        System.out.println("B contains: " + map.containsKey("B"));
        System.out.println("Remove(pop) B: " + map.remove("B"));
        System.out.println("B contains: " + map.containsKey("B"));
    }
}
