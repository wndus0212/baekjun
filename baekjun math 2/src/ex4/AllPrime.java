package ex4;

import java.util.Scanner;
public class AllPrime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int lowN=s.nextInt();
		int highN=s.nextInt();
		for(int i=lowN; i<=highN; i++) {
			boolean isPrime=true;
			int number= i;
			int sqr= (int) Math.sqrt(number);
			
			for(int j=2; j<=sqr;j++) {
				if(number%j==0) {
					isPrime=false;
					break;
				}
			}
			
			if((isPrime&&number!=1)||number==2) {
				System.out.println(number);
			}
		}
	}

}
