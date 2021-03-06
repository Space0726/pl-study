import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();

        arrList.add(3);
        arrList.add(9);
        arrList.add(2);

        for (int a: arrList)
            System.out.println(a);
        System.out.println("Size: " + arrList.size());
        System.out.println("Random Access at 1: " + arrList.get(1) + "\n");

        Collections.sort(arrList);
        for (int a: arrList)
            System.out.println(a);
        System.out.println("Size: " + arrList.size() + "\n");

        arrList.remove(2);
        for (int a: arrList)
            System.out.println(a);
        System.out.println("Size: " + arrList.size() + "\n");

        arrList.set(0, 10);
        for (int a: arrList)
            System.out.println(a);
        System.out.println("Size: " + arrList.size() + "\n");
    }
}
