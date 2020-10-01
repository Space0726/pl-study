import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for (String key: map.keySet())
            System.out.println(String.format("key: %s, value: %d", key, map.get(key)));
        System.out.println("Size: " + map.size() + "\n");
        System.out.println("B contains: " + map.containsKey("B"));
        System.out.println("Remove(pop) B: " + map.remove("B"));
        System.out.println("B contains: " + map.containsKey("B") + "\n");

        map.replace("A", 100);

        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("key: %s, value: %d", key, map.get(key)));
        }
    }
}
