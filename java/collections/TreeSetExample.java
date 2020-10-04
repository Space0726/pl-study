// TreeSet is implemented by red black tree
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);

        for (int e: ts)
            System.out.println(e + " ");

        System.out.println("between 10, 20 subset: " + ts.subSet(10, 20));
        System.out.println("first, third subset: " + ts.subSet(10,true, 20, true));

        ts.remove(40);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext())
            System.out.println(it.next() + " ");

        System.out.println("Size: " + ts.size());
    }
}
