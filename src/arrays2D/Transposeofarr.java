package arrays2D;

import java.util.Scanner;

public class Transposeofarr {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter rows and columns");
		int r=read.nextInt();
		int c=read.nextInt();
		int[][] matrix=create2d(r,c);
		int[][] trans=transposeof(matrix);
		display(trans);
		
	}
	
	public static int[][] create2d(int row,int col) {
		Scanner read=new Scanner(System.in);
		int[][] arr=new int[row][col];
		System.out.println("enter the elements of matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=read.nextInt();
			}
		}
		
		System.out.println("og array");
		for(int[] ro:arr) {
			for(int val:ro) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		return arr;
		
	}
	public static int[][] transposeof(int[][] ar){
		int rw=ar.length;
		int cl=ar[0].length;
		int[][] temptrans=new int[cl][rw];
		for(int i=0;i<rw;i++) {
			for(int j=0;j<cl;j++) {
				temptrans[j][i]=ar[i][j];
			}
		}
		
		return temptrans;
		
		
	}
	public static void display(int[][] arry) {
		System.out.println("transpose array");
		for(int[] row:arry) {
			for(int value:row) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
		
	}
}

