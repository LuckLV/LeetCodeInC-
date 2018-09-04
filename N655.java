package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N655 {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public List<List<String>> printTree(TreeNode root) {
		
		List<List<String>> res = new ArrayList<>();
		
		int depth = getDepth(root);
		int width = (int) (Math.pow(2, depth) - 1);
		String[][] r = new String[width][width];
		
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r.length; j++) {
				r[i][j] = "";
			}
		}
		int pre = 0, cur = 0;
		int d = 0;
		Queue q = new LinkedList<>();
		q.offer(root);
		
		while (!q.isEmpty() && d < depth) {
			cur = width / (2<<d);
			
			for (int i = 0; i < 1<<d; i++) {
				
				if (q.peek().equals("")) {
					q.poll();
					if(i != 0)
					    cur = cur + pre + 1;
					q.offer("");
					q.offer("");
				}else{
					TreeNode tmp = (TreeNode) q.poll();
					 
					if (i == 0) {
						r[d][cur] += tmp.val; 
					}else{
						cur = cur + pre + 1;
						r[d][cur] += tmp.val; 
					}
					
					if (tmp.left != null) {
						q.offer(tmp.left);
					}else{
						q.offer("");
					}
					
					if (tmp.right != null) {
						q.offer(tmp.right);
					}else{
						q.offer("");
					}
				}
				
			}
			pre = width / (2<<d);
			d++;
			
		}
		for(String[] arr:r)
            res.add(Arrays.asList(arr));	
		return res;
	}
	
	
	private int getDepth(TreeNode root) {
		
		if (root == null) {
			return 0;
		}
		
		return 1 + Math.max(getDepth(root.right), getDepth(root.left));
	}
	
	
}
