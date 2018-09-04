package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N863 {

	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }
	
	class Solution {
		Map<TreeNode, TreeNode> parent;
		public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
			parent = new HashMap<>();
			dfs(root, null);
			
			
			return null;
	        
			
	    }
		
		private void dfs(TreeNode node, TreeNode par) {
			
			if (node != null) {
				parent.put(node, par);
				dfs(node.left, node);
				dfs(node.right, node);
			}
			
		}
		
	}
}
