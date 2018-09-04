package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N886 {
public static void main(String[] args) {
	int[] color = new int[5];
	System.out.println(color[1] == 0);
}
	class Solution{
		
		public boolean possibleBipartition(int N, int[][] dislikes) {
			List<List<Integer>> graph = new ArrayList<List<Integer>>();
			for (int i = 0; i < N; i++) {
				graph.add(new ArrayList<Integer>());
			}
			for (int[] pair : dislikes){
				graph.get(pair[0] - 1).add(pair[1] - 1);
				graph.get(pair[1] - 1).add(pair[0] - 1);
			}
			int[] color = new int[N];
			for (int i = 0; i < color.length; i++) {
				if (color[i] == 0 && !dfs(graph, color, i, 1)) {
					return false;
				}
			}
			
			return true;
		}
		
		private boolean dfs(List<List<Integer>> graph, int[] color, int index, int c) {
			
			color[index] = c;
			for (int g : graph.get(index)) {
				if (color[g] == c) {
					return false;
				}
				if (color[g] == 0 && !dfs(graph, color, g, -c)) {
					return false;
				}
			}
			
			return true;
		}
	}
}
