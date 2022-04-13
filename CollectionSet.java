import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(10, (float) 0.8);

        set.add("One");
        set.add("Two");
        set.add("Three");
        
        Iterator<String> it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        
        System.out.println(" ----- ");
        
        // When duplication occurs.
        // It will add new element and remove old element.
        set.add("Two");
        set.add("Four");
        set.add("Five");

        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}