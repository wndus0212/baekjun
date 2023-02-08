package ex7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SortInside {
	public static int getDigit(int n) {
		int digit=1;
		while(true) {
			n=n/10;
			
			if(n==0) {
			
				break;
			}
			
			digit++;
		}
		
		return digit;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

		String sN=br.readLine();
		int n= Integer.parseInt(sN);
		int tmp=n;
		int digit=getDigit(n);
		
		int [] counting= new int[10];
		
		int[] array= new int[digit];
		int sorted=0;
		
		for(int i=1; i<=digit; i++) {
			
			array[i-1]=(int) (tmp/Math.pow(10, digit-i));
			
			tmp=tmp%(int) (Math.pow(10, digit-i));
			
			counting[array[i-1]]++;
		}
		
		int zeroCounting=counting[0];
		
		for(int i=9; i>=0; i--) {
			if(counting[i]!=0) {
				while(counting[i]>0) {
					sorted=(int) (sorted+Math.pow(10, --digit)*i);
					
					counting[i]--;
				}
			}
		}
		
		
		bw.write(sorted+"\n");
		bw.flush();
		bw.close();
	}

}
