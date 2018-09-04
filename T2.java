package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class T2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		tmp = br.readLine();
		int inp  = Integer.parseInt(tmp);
		
		Map<Integer, Integer> cards = new TreeMap<Integer, Integer>();
		List<Integer> res = new ArrayList<>(); 
		int[] pos = new int[inp];
		
		for (int i = 0; i < inp; i++) {
			tmp = br.readLine();
			String[] split = tmp.split(" ");
			pos[i] = Integer.parseInt(split[0]);
			cards.put(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
		}
		
		for (int i = 0; i < pos.length; i++) {
			res.add(sumFall(pos, cards, pos[i]));
		}
		
		System.out.println(res);
	}
	
	public static int sumFall(int[]a, Map<Integer, Integer> cards, int key) {
		
		int sum = 1;
		int down = key + cards.get(key);
		
		for (int k : cards.keySet()) {
			if (k > key) {
				if (down > k) {
					sum++;
					down = Math.max(down, k + cards.get(k));
				}else{
					return sum;
				}
			}
		}
		
		return sum;
	}
	
}
