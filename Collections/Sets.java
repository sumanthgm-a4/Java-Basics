import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Adding Elements
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(1);

        // Adding multiple elements
        set.addAll(Arrays.asList(1, 5, 2, 7, 0, 6));

        System.out.println(set);

        // Remove
        set.remove(1);

        System.out.println(set);

        // Iterate
        for (int num : set) System.out.println(num);

        // Existence
        System.out.println(set.contains(2));

        // Size
        System.out.println(set.size());

        // Clear
        set.clear();
    }
}
