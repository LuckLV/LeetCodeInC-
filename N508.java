package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class N508 {

	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	
	public int[] findFrequentTreeSum(TreeNode root) {
		
		int[] start = {};
        if(root == null) return start;
		
		Map<Integer, Integer> res = new HashMap<>();
		
		int sum = 0;
		
		Queue q = new LinkedList<>();
		
		q.offer(root);
		
		while (!q.isEmpty()) {
			TreeNode temp =  (TreeNode) q.poll();
			sum = sumSubtree(temp);
			q.offer(temp.left);
			q.offer(temp.right);
			
			if (res.containsKey(sum)) {
				res.put(sum, res.get(sum) + 1);
			}else{
				res.put(sum, 1);
			}						
		}
		
		
		int[] s = new int[res.size()];
		int j = 0, max = 0;
		for (int i : res.keySet()) {
			s[j] = i;
			if (max < res.get(i)) {
				max = res.get(i);
			}
			j++;
		}
		
		if (max == 1) {
			return s;
		}else{
			List<Integer> p = new ArrayList<>();
			for (int i : res.keySet()) {	
				if (res.get(i) == max) {
					p.add(i);
				}
			}
			int[] k = new int[p.size()];
			for (int i = 0; i < p.size(); i++) {
				k[i] = p.get(i);
			}
			
			return k;
		}
			
	}
	
	private int sumSubtree(TreeNode root) {
		
		if (root == null) {
			return 0;
		}				
		return root.val + sumSubtree(root.left) + sumSubtree(root.right);
	}
	
	public static void main(String[] args) {
		String a = "";
		String b = "";
		Queue q = new LinkedList<>();
		q.offer("s");
		q.offer(a);
		q.offer(b);
		q.offer("s");
		q.poll();
		
		int cur = 15 / (2<<0);
		
		
		System.out.println(q);
	}
	
	
	
}
