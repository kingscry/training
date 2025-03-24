package array;

public class Binsearch {
	public static void main(String[] args) {
		int[] arr= {2,7,9,15,20,75};
		int x=75;
		int l=0;
		int h=arr.length-1;
		
		while (l<=h) {
			int mid=l+(h-l)/2;
			if(arr[mid]==x) {
				System.out.println(mid);
				break;
			}
			else if(arr[mid]<x) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
			
		}
	}

}
