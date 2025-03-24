package arrays2D;
import java.util.Scanner;
import java.util.Arrays;
public class Jaggedarr {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter numbers of rows for jagged array");
		int r=read.nextInt();
		int[][] arr=new int[r][];
		for(int i=0;i<r;i++) {
			System.out.println("enter the number of col for row "+i+" elements");
			int c=read.nextInt();
			System.out.println("enter the elements");
			arr[i]=new int[c];  
			for(int j=0;j<c;j++) {
				arr[i][j]=read.nextInt();
			}
		}
		System.out.println("og array");
		for(int i=0;i<r;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
