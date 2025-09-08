
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Put
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Orange", 90);

        System.out.println(map);

        // Get
        System.out.println(map.get("Apple"));

        // Existence
        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsValue(123));

        // Iterate keys
        for (String key : map.keySet()) System.out.print(key + " ");

        System.out.println();

        // Iterate values
        for (Integer value : map.values()) System.out.print(value + " ");

        System.out.println();

        // Iterate key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        // Remove
        map.remove("Orange");

        // Replace / Update
        map.replace("Apple", 120);
    }
}
