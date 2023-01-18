package ex2;

import java.util.Scanner;

public class CutLine {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		int k=s.nextInt();
		int[] people=new int [n];
		
		for(int i=0; i<n; i++) {
			people[i]=s.nextInt();
		}
		
		for(int i=1; i<n; i++) {
			int a=people[i];
			int j=i-1;
			while(j>=0&&people[j]<a) {
				int tmp=people[j+1];
				people[j+1]=people[j];
				people[j]=tmp;
				j--;
			}
		}
		
		System.out.println(people[k-1]);
				
	}
}
