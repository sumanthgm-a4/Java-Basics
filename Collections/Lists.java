import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Mango"); // insert at index

        System.out.println(list);

        // Access
        System.out.println(list.get(1));

        // Remove
        list.remove("Apple");
        list.remove(0); // by index

        // Search
        System.out.println(list.contains("Banana"));
        System.out.println(list.indexOf("Banana"));
        System.out.println(list.contains("Orange"));
        System.out.println(list.indexOf("Orange"));

        // Iterate
        for (String fruit : list) System.out.println(fruit);

        // Clear
        list.clear();
        System.out.println(list);

        
    }
}
