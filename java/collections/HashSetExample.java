import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class Animal {
    String species;
    String habitat;

    Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }

    public String toString() { return species + "-" + habitat; }

    public int hashCode() { return (species + habitat).hashCode(); }

    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal temp = (Animal) obj;
            return species.equals(temp.species) && habitat.equals(temp.habitat);
        } else {
            return false;
        }
    }

}

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

        System.out.println("Size: " + hs2.size() + "\n");

        // For class example
        Set<Animal> hs = new HashSet<>();

        hs.add(new Animal("Cat", "Land"));
        hs.add(new Animal("Cat", "Land"));
        hs.add(new Animal("Cat", "Land"));

        System.out.println(hs.size());
        for (Animal e: hs)
            System.out.println(e);
    }
}
