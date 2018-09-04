package leetcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testtime = null;

		//System.out.println("输入数据：");
		testtime = br.readLine();
		//String[] split = testtime.split(" ");
		int cz = Integer.parseInt(testtime);
		//testtime = br.readLine();
		//String[] split = testtime.split(" ");
		ArrayList<String[]> a = new ArrayList<>();
		
		for (int i = 0; i < cz; i++) {
			
			
				testtime = br.readLine();
				String[] split = testtime.split(" ");
				split[split.length - 1] = i;
				
				a.add(split);
				
				
				
			}
			a.add(Integer.parseInt());
		}
		
		
		
		
		
	}
	
	class DfsTest{
		public void dfsTraverse(int N, int[][] graph) {
			boolean[] vistied = new boolean[N];
			for (int i = 0; i < vistied.length; i++) {
				vistied[i] = false;
			}
			for (int i = 0; i < vistied.length; i++) {
				if(!vistied[i])
					dfs(i, graph, vistied);
			}
		}
		
		private void dfs(int index, int[][] graph, boolean[] visited) {
			visited[index] = true;
			for (int i = 0; i < visited.length; i++) {
				if (!visited[i] && graph[index][i] == 1) {
					dfs(i, graph, visited);
				}
			}
		}
		
		public void dfsmap(int N, int[][] graph) {
			boolean[] vistied = new boolean[N];
			for (int i = 0; i < vistied.length; i++) {
				vistied[i] = false;
			}
			Stack<Integer> stack = new Stack<>();
			for (int i = 0; i < vistied.length; i++) {
				if (!vistied[i]) {
					vistied[i] = true;
					stack.push(i);
				}
				
				while (!stack.isEmpty()) {
					int k = stack.pop();
					for (int j = 0; j < vistied.length; j++) {
						if (!vistied[k] && graph[k][j] == 1) {
							stack.push(j);
							vistied[j] = true;
							break;
						}
					}
				}
			}
		}
		
		public void bfsmap(int N, int[][] graph) {
			boolean[] visited = new boolean[N];
			for (int i = 0; i < visited.length; i++) {
				visited[i] = false;
			}
			
			Queue<Integer> q = new LinkedList<>();
			
			for (int i = 0; i < visited.length; i++) {
				if (!visited[i]) {
					visited[i] = true;
					q.add(i);
					
					while (!q.isEmpty()) {
						int k = q.poll();
						for (int j = 0; j < visited.length; j++) {
							if(!visited[j] && graph[k][j] == 1){
								q.add(j);
								visited[j] = true;
							}
						}	
					}
					
				}
			}
			
		}
			
		
	}
	
	
	
	
	
}
