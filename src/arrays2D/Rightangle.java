package arrays2D;

public class Rightangle {
	public static void main(String[] args) {
		int[][] arr=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int temp;
		ninty(arr);
	}
	public static void ninty(int[][] ar) {
		int l=ar.length;
		int[][] narr=new int[l][l];
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				narr[j][l-1-i]=ar[i][j];
			}
		}
			for(int[] row:narr) {
				for(int value:row) {
					System.out.print(value+" ");
				}
				System.out.println();
			}
		
	}

}
