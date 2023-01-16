package ex3;

import java.util.Scanner;

public class ColorPaper {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();

		boolean[][]bigPaper= new boolean[100][100];
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				bigPaper[i][j]=false;
			}
		}
		
		
		for(int i=0; i<n; i++) {
			int x= s.nextInt();
			int y=s.nextInt();
			for(int a=x; a<x+10;a++) {
				for(int b=y; b<y+10; b++) {
					bigPaper[a][b]=true;
				}
				
			}
		}
		
		int sum=0; 
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(bigPaper[i][j]==true) {
					sum++;
				}
			}
			
		}
		
		System.out.println(sum);
	}

}
