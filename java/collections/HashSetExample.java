import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hs1 = new HashSet<>();
        Set<String> hs2 = new HashSet<>();

        hs1.add("ABC");
        hs1.add("DEF");
        System.out.println(hs1.add("GHI"));
        System.out.println(hs1.add("GHI"));     // Returns false because already exists

        for (String e: hs1)
            System.out.println(e + " ");
        System.out.println();

        // Order is doesn't matter
        hs2.add("DEF");
        hs2.add("GHI");
        hs2.add("ABC");

        Iterator<String> it = hs2.iterator();
        while (it.hasNext())
            System.out.println(it.next() + " ");

        System.out.println("Size: " + hs2.size());
    }
}
