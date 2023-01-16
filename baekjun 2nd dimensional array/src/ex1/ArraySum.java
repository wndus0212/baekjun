package ex1;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int x= s.nextInt();
		int y=s.nextInt();
		
		int[][] array1= new int[x][y];
		int[][] array2= new int[x][y];
		int[][] arraySum= new int[x][y];
		
		for(int i=0; i<x;i++) {
			for(int j=0; j<y; j++) {
				array1[i][j]=s.nextInt();
			}
		}
		
		for(int i=0; i<x;i++) {
			for(int j=0; j<y; j++) {
				array2[i][j]=s.nextInt();
			}
		}
		
		for(int i=0; i<x;i++) {
			for(int j=0; j<y; j++) {
				arraySum[i][j]=array1[i][j]+array2[i][j];
				
				if(j==y-1) {
					System.out.print(arraySum[i][j]);
				}else {
					System.out.print(arraySum[i][j]+" ");
				}
			}
			System.out.println();
		}

	}

}
