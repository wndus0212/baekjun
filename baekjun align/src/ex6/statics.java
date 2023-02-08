package ex6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class statics {
	public static int abs=40000;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		int[] array= new int[n];

		int[] counting= new int[abs*2+1];
		int[] result= new int [n];
		
		for(int i=0; i<n;i++) {
			array[i]=Integer.parseInt(br.readLine());
			counting[array[i]+abs]++;
		}
		
		int tmp=0; 
		int maxCounting=0;
		int mode=0;
		int secMinMode=abs*2;
		int MinMode=abs*2;
		
		for(int i=0; i<abs*2+1; i++) {
			if(counting[i]>maxCounting) {
				maxCounting=counting[i];
				mode=i;
			}
		}
		
		for(int i=0; i<abs*2+1; i++) {
			if(counting[i]==maxCounting) {
				tmp++;
				mode=i-abs;
			}
		}
		
		if(tmp>1) {
			for(int i=0; i<abs*2+1; i++) {
				if(counting[i]==maxCounting) {
					
					
					if(i<MinMode) {
						MinMode=i;
					}
				}
			}
			
			for(int i=0; i<abs*2+1; i++) {
				if(counting[i]==maxCounting) {
					
					
					if(i>MinMode&&i<secMinMode) {
						secMinMode=i;
					}
				}
			}
			mode=secMinMode-abs;
		}
		
		for(int i=1; i<counting.length; i++) {
			counting[i]+=counting[i-1];
		}
		
		for(int i=n-1; i>=0; i--) {
			int value=array[i]+abs;
			counting[value]--;
			result[counting[value]]=value-abs;
		}
		
		
		double sum=0; 
		for(int i=0; i<n; i++) {
			sum=sum+result[i];
		}
		
		
		double fn=n;
		double favg=sum/n;
		System.out.println(favg);
		//System.out.println(favg);
		if(favg%1>=0.5) {
			favg=favg-favg%1+1;
		}else if(favg%1<=-0.5) {
			favg=favg-favg%1-1;
		}
		int avg=(int) favg;
		
		int mid=result[n/2];
		int range=result[n-1]-result[0];
		if(range<0) {
			range=range*(-1);
		}
		
		bw.write(avg+"\n");
		bw.write(mid+"\n");
		bw.write(mode+"\n");
		bw.write(range+"\n");
		
		bw.flush(); 
		bw.close();
	}

}
