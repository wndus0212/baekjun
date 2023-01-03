package ex1;
import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int answer=0;
		for(int i=0; i<n; i++) {
			boolean isPrime=true;
			int number= s.nextInt();
			int sqr= (int) Math.sqrt(number);
			
			for(int j=2; j<=sqr;j++) {
				if(number%j==0) {
					isPrime=false;
					break;
				}
			}
			if((isPrime&&number!=1)||number==2) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
