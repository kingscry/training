package arrays2D;

// import java.util.Scanner;

public class Sysmetricarray {
	public static void main(String[] args) {
		int[][] arr=new int[][]{{1,2,3},{2,5,6},{3,6,9}};
//		Scanner read=new Scanner(System.in);
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=read.nextInt();
//	}
//}
		System.out.println(check(arr));
}
	public static boolean check(int[][] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				if(ar[i][j]!=ar[j][i]) {
					return false;
				}
			}
	}
		return true;
		
	}
}
