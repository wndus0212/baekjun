package ex3;

import java.util.Scanner;

public class AvgAndMid {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n[]= new int[5];
		int sum=0;
		for(int i=0; i<5; i++) {
			n[i]=s.nextInt();
			sum=sum+n[i];
		}
		
		for(int i=1; i<5;i++) {
			int j=i-1;
			int a=n[i];
			while(j>=0&&n[j]>a) {
				int tmp=n[j];
				n[j]=n[j+1];
				n[j+1]=tmp;
				j--;
			}
		}
		
		System.out.println(sum/5);
		System.out.println(n[2]);

	}

}
