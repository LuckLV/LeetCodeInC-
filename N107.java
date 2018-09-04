package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }


public class N107 {
	//从最低层，分层输出值的集合
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> resfin = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(q.size() > 0){
        	List<Integer> res = new ArrayList<>();
        	int size = q.size();
        	for(int i = 0; i < size; i++){
        		TreeNode a = q.poll();
        		res.add(a.val);
        		if(a.left != null)
        			q.add(a.left);
        		if(a.right != null)
        			q.add(a.right);
        	}
        	resfin.add(res);
        }
        
		return resfin;
        
    }
}
