package ex5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Align3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

		int n= Integer.parseInt(br.readLine());
		int[] num= new int [10001];
		
		for(int i=0; i<n; i++) {
			num[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1; i<=10000; i++) {
			while(num[i]>0) {
				bw.write(i+"\n");
				num[i]--;
			}
		}
		
		
		bw.flush();
		bw.close();
	}

}
