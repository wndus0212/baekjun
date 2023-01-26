package ex4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Align2 {
	public static int [] sorted;
	
	public static void merge_sort(int[] a) {
		sorted= new int[a.length];
		merge_sort(a,0,a.length-1);
		sorted=null;
	}
	
	private static void merge_sort(int[] a, int left, int right) {
		if(left==right) {
			return;
		}
		
		int mid=(left+right)/2;
		merge_sort(a,left,mid);
		merge_sort(a,mid+1,right);
		
		merge(a,left,mid,right);
	}
	
	private static void merge(int[] a, int left, int mid, int right) {
		int l= left;
		int r= mid+1;
		int idx=left;

		while(l<=mid&&r<=right) {
			if(a[l]<=a[r]) {
				sorted[idx]=a[l];
				idx++;
				l++;
				
			}else {
				sorted[idx]=a[r];
				idx++;
				r++;
			}
		}
		
		
		if(l>mid) {
			while(r<=right) {
				sorted[idx]=a[r];
				idx++;
				r++;
			}
		}else {
			while(l<=mid) {
				sorted[idx]=a[l];
				idx++;
				l++;
			}
		}
		
		for(int i=left; i<=right;i++) {
			a[i]=sorted[i];
		}

	}
	
	public static void main(String[] args) throws IOException {
		Scanner s= new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		int[] num= new int [n];
		for(int i=0; i<n; i++) {
			num[i]= Integer.parseInt(br.readLine());
		}
		
		merge_sort(num);
		for(int i=0; i<n; i++) {
			bw.write(num[i]+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
