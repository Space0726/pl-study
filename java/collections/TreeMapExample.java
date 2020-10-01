// TreeMap is implemented by red black tree
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        // Sorted saving
        System.out.println("Keys: " + map.keySet() + "\n");
        for (Integer key: map.keySet())
            System.out.println(String.format("key: %d, value: %s", key, map.get(key)));
        System.out.println();

        map.remove(4);

        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            System.out.println(String.format("key: %d, value: %s", key, map.get(key)));
        }
        System.out.println();

        map.replace(2, "Second");

        for (Integer key: map.keySet())
            System.out.println(String.format("key: %d, value: %s", key, map.get(key)));
        System.out.println("Size: " + map.size());
    }
}
