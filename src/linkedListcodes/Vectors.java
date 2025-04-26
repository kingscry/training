package linkedListcodes;
import java.util.*;

public class Vectors {
	public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();


        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println("Initial Vector: " + vector);

        int firstElement = vector.get(0);
        System.out.println("First Element: " + firstElement);

        System.out.println("Size of Vector: " + vector.size());

        vector.remove(2); // Removes the element at index 2 (30)
        System.out.println("Vector after removing element at index 2: " + vector);

        boolean containsValue = vector.contains(20);
        System.out.println("Vector contains 20: " + containsValue);

        System.out.println("Iterating through Vector:");
        for (Integer num : vector) {
            System.out.println(num);
        }
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
	

}
