import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(3);
        arrList.add(1);
        arrList.add(2);

        for (int a: arrList)
            System.out.println(a);
        System.out.println("Size: " + arrList.size() + "\n");

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
