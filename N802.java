package leetcode;

import java.util.ArrayList;
import java.util.List;
//图的深度优先搜索
public class N802 {
	public List<Integer> eventualSafeNodes(int[][] graph) {
        
		List<Integer> res = new ArrayList<>();
		
		int[] visit = new int[graph.length];
		
		for (int i = 0; i < visit.length; i++) {
			if (dfs(i, graph, visit)) {
				res.add(i);
			}
		}
		
		
		return res;
    }
	
	private boolean dfs(int node, int[][] graph, int[] visit){
		
		if(visit[node] > 0)
			return visit[node] == 2;
		
		visit[node] = 1;
		for (int i = 0; i < graph[node].length; i++) {
			if (visit[graph[node][i]] == 2) {
				continue;
			}
			
			if(visit[graph[node][i]] == 1 || !dfs(graph[node][i], graph, visit)){
				return false;
			}
			
		}
		visit[node] = 2;
		return true;
	}
	
}
