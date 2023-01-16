package ex2;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int [][]n= new int[9][9];
		
		int maxN=0;
		int maxX=1;
		int maxY=1;
		for(int i=0;i<9; i++) {
			for(int j=0; j<9; j++) {
				n[i][j]=s.nextInt();
				if(n[i][j]>maxN) {
					maxN=n[i][j];
					maxX=i+1;
					maxY=j+1;
				}
			}
		}
		
		System.out.println(maxN);
		System.out.println(maxX+" "+maxY);

	}

}
