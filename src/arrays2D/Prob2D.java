package arrays2D;

import java.util.Scanner;
import java.util.Arrays;

public class Prob2D {
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		Scanner read=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=read.nextInt();
				
	}
}
		int maxim=maxof2D(arr);
		System.out.println("maximmum element="+ maxim);
}
	public static int maxof2D(int[][] ar) {
		int maxi=ar[0][0];
		for(int[] row:ar) {
			for(int value:row) {
				if (maxi<value) {
					maxi=value;
				}
	}
}
		return maxi;
				
	}
}
