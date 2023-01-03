package ex3;

import java.util.Scanner;
import java.lang.Math;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		
		while(true) {
			boolean isPrime=true;
			int number= n;
			int sqr= (int) Math.sqrt(number);
			
			for(int j=2; j<=sqr;j++) {
				if(number%j==0) {
					isPrime=false;
					break;
				}
			}
			
			if(!isPrime) {
				for(int i=2; i<=Math.sqrt(n);i++) {
					if(n%i==0) {
						System.out.println(i);
						n=n/i;
						break;
					}
				}
			}else {
				System.out.println(n);
				break;
			}
		}
	}

}
