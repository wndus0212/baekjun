package ex6;

import java.util.Scanner;

public class goldbach {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(i+1+"번째 케이스");
			int num=s.nextInt();
			System.out.println("int="+num);
			int a, b;
			if(num%2==0) {
				a=num/2;
				b=num/2;
			}else {
				a=num/2;
				b=num/2+1;
			}
			
			while(true) {
				boolean tmp=true;
				boolean isAPrime=false;
				boolean isBPrime=false;
				
				for( int j=2; j<=Math.sqrt(a);j++) {
					if(a%j==0) {
						tmp=false;
					}
				}
				
				if((tmp&&a!=1)||a==2) {
					isAPrime=true;
				}
				tmp=true;
				for( int j=2; j<=Math.sqrt(b);j++) {
					if(b%j==0) {
						tmp=false;
						break;
					}
				}
				
				if((tmp&&b!=1)||b==2) {
					isBPrime=true;
				}
				
				if(isAPrime==true&&isBPrime==true) {
					System.out.println(a+" "+b);
					break;
				}else {
					a=a-1;
					b=b+1;
				}
			}
		}
	}
}
