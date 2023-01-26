package ex4;

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
		System.out.println("a[l]="+a[l]);
		System.out.println("a[r]="+a[r]);
		while(l<=mid&&r<=right) {
			if(a[l]<=a[r]) {
				sorted[idx]=a[l];
				System.out.println("sorted[l]="+sorted[l]);
				idx++;
				l++;
				
			}else {
				sorted[idx]=a[r];
				System.out.println("sorted[r]="+sorted[r]);
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
		
		for(int i=left;i<=right; i++) {
			a[i]=sorted[i];
		}
		
		System.out.println("merged!");
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] num= new int [n];
		for(int i=0; i<n; i++) {
			num[i]=s.nextInt();
		}
		
		merge_sort(num);
		for(int i=0; i<n; i++) {
			System.out.println(num[i]);
		}
	}
}
