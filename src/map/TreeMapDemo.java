package map;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
        // Creating a TreeMap instance
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        // Displaying the TreeMap (it will be sorted by the keys)
        System.out.println("TreeMap: " + treeMap);

        // Getting a value for a specific key
        System.out.println("Value for key 3: " + treeMap.get(3));

        // Removing an element by key
        treeMap.remove(4);
        System.out.println("TreeMap after removal of key 4: " + treeMap);

        // Checking if a key exists
        System.out.println("Does key 2 exist? " + treeMap.containsKey(2));

        // Checking if a value exists
        System.out.println("Does value 'Five' exist? " + treeMap.containsValue("Five"));

        // Getting the first and last keys
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        // Getting the first and last entry
        System.out.println("First entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());

        // Iterating over the TreeMap using entrySet
        System.out.println("\nIterating over the TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Navigating through the TreeMap with specific methods
        System.out.println("\nKey less than 3: " + treeMap.lowerKey(3));
        System.out.println("Key greater than 3: " + treeMap.higherKey(3));
        System.out.println("Key less than or equal to 3: " + treeMap.floorKey(3));
        System.out.println("Key greater than or equal to 3: " + treeMap.ceilingKey(3));
    }

}
