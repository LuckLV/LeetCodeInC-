package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class N222 {
	public int countNodes(TreeNode root) {
        /*Queue q = new LinkedList();
        
        q.add(root);
        int count = 0;
        while(!q.isEmpty()){
        	TreeNode temp = (TreeNode) q.poll();
        	count++;
        	if (temp.left != null) {
				q.add(temp.left);
			}
        	if (temp.right != null) {
				q.add(temp.right);
			}   	
        }
        */
        if (root == null) {
			return 0;
		}
        int ldepth = getDepth(root.left);
        int rdepth = getDepth(root.right);
        
        if (ldepth == rdepth) {
			return (1<<ldepth) + countNodes(root.right);
		}else{
			return (1<<rdepth) + countNodes(root.left);
		}
        
    }
	
	
	private int getDepth(TreeNode root){
		int depth = 0;
		
		while (root != null) {
			depth++;
			root = root.left;
		}
		return depth;
	}
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
}
