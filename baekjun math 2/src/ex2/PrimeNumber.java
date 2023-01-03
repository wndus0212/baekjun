package ex2;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int lowN=s.nextInt();
		int highN=s.nextInt();
		int primeSum=0;
		int primeMin=0;
		for(int i=lowN; i<highN; i++) {
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
				primeSum=primeSum+number;
				if(primeMin>number||primeMin==0) {
					primeMin=number;
				}
			}
		}
		
		if(primeSum!=0) {
			System.out.println(primeSum);
			System.out.println(primeMin);
		}else {
			System.out.println(-1);
		}
	}
}
