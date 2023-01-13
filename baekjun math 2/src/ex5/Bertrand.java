package ex5;

import java.util.Scanner;

public class Bertrand {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		while(true) {
			int n= s.nextInt();
			int answer=0;
			
			if(n==0) {
				break;
			}
			
			for(int i=n; i<=n*2; i++) {
				boolean isPrime=true;
				int number= n;
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

}
