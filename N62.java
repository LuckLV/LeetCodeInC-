package leetcode;

import java.util.ArrayList;

public class N62 {
	class Solution {
		
		//成功但超时，转化为数学问题
		public int uniquePaths(int m, int n) {
	    	
	    	ArrayList<Integer> num = new ArrayList<>();
	    	
	    	findPath(1, 1, num, n, m);
	    	
	    	
			return num.size();
	        
	    }

		public void findPath(int rowstart, int colstart,
				ArrayList<Integer> num, int rowend, int colend) {
			if((rowstart == rowend) && (colstart == colend)){
				num.add(1);
				return;
			}else if((rowstart < rowend) && (colstart < colend)){
				findPath(rowstart, colstart + 1, num, rowend, colend);
				findPath(rowstart + 1, colstart, num, rowend, colend);				
			}else if((rowstart < rowend) && (colstart == colend)){
				findPath(rowstart + 1, colstart, num, rowend, colend);
			}else{
				findPath(rowstart, colstart + 1, num, rowend, colend);
			}			
		}
	}
}
