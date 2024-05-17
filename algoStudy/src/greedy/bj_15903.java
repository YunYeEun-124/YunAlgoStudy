package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_15903 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int index1 = 0;
		int index2 = 0;
		long[] arr = new long[n];
		st = new StringTokenizer(br.readLine());
		//입력
		for(int i=0;i<n;i++) 
				arr[i] =Long.parseLong(st.nextToken());
		
		for(int i=0;i<m;i++) {
			Arrays.sort(arr);
			arr[0] += arr[1];
			arr[1] = arr[0];
		}
		
		System.out.println(Arrays.stream(arr).sum());
		
	}

}
