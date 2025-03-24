package array;
import java.util.Arrays;

public class Arraypr2 {
	public static void main(String[] args) {
		int[] arr= {1,2,45,67,78};
		int[] arr2= {1,2,3,4};
		int target=45;
		System.out.println(Arrays.binarySearch(arr,target));
		
		int[] array=Arrays.copyOf(arr, 7);
		for(int i:array) {
			System.out.println(i);
		
		}
		for(int i : Arrays.copyOfRange(arr, 0, 2)) {
			System.out.println(i);
		}
		System.out.println(Arrays.equals(arr, arr2));
		int[] arr3= {3,4,67,7,9,36};
		Arrays.sort(arr3);
		for(int i:arr3) {
			System.out.println(i);	
		}
		System.out.println(Arrays.toString(arr3));
	}

}
