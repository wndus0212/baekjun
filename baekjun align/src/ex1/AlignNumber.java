package ex1;

import java.util.Scanner;

public class AlignNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int [] num= new int [n];
		for(int i=0; i<n; i++) {
			num[i]=s.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				int tmp=0; 
				if(num[j]<num[i]) {
					tmp=num[j];
					num[j]=num[i];
					num[i]=tmp;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(num[i]);
		}
	}

}
