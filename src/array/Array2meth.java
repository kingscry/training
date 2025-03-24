package array;

import java.util.Scanner;

public class Array2meth {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=read.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=read.nextInt();
		}
		palin(arr);
		}
	public static void palin(int[] ar){
		
		int rev;
		int rem;
		for(int i=0;i<ar.length;i++) {
			int x=ar[i];
		    int og=x;
		    rev=1;
			while (x>0){
				rem=x%10;
				rev=(rev*10)+rem;
				x=x/10;
			}
			if (og==rev) {
		         System.out.print(og+" ");
		         }
	}

}
}	
