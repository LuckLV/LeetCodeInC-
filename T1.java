package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		tmp = br.readLine();
		String[] split = tmp.split(" ");
		int[] arr = new int[split.length];
		
		for (int i = 0; i < split.length; i++) {
			arr[i] = Integer.parseInt(split[i]);
		}
		
		if (arr[0] >= arr[1]) {
			System.out.println(arr[0] - arr[1]);
		}else{
			if (arr[0] * 2 >= arr[1]) {
				System.out.println(arr[0] - arr[1] / 2 + 1);
			}else{
				int a = findNum(arr);
				System.out.println(a * arr[0]- arr[1] / 2 + 1);
			}
			
		}	
	}
	
	private static int findNum(int[] arr) {
		int temp = arr[0];
		int sum = 0;
		while (temp > arr[1]) {
			temp = temp * 2;
			sum++;
		}
		
		
		return sum;
	}
	
}
