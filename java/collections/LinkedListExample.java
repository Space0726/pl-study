import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(3);
        linkedList.add(9);
        linkedList.add(2);

        for (int a: linkedList)
            System.out.println(a);
        System.out.println("Size: " + linkedList.size());
        System.out.println("Access at 1(not random but sequence): " + linkedList.get(1) + "\n");

        Collections.sort(linkedList);
        for (int a: linkedList)
            System.out.println(a);
        System.out.println("Size: " + linkedList.size() + "\n");

        linkedList.remove(2);
        for (int a: linkedList)
            System.out.println(a);
        System.out.println("Size: " + linkedList.size() + "\n");

        linkedList.set(0, 10);
        for (int a: linkedList)
            System.out.println(a);
        System.out.println("Size: " + linkedList.size() + "\n");
    }
}
