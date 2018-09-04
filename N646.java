package leetcode;

import java.util.Arrays;


public class N646 {
	
	//[[-10,-8],[],[-5,0],[6,10],[-6,-4],[1,7],[9,10],[-4,7]]
	class Solution {
	    public int findLongestChain(int[][] pairs) {
	    	//Arrays.sort(pairs, (p1,p2)->p1[1]-p2[1] );//lambda表达式java8

	        int count = 0, end = Integer.MIN_VALUE;
	        for (int[] pair : pairs)
	        {
	            if (pair[0] > end)
	            {
	                count++;
	                end = pair[1];
	            }
	        }
	        return count;
	    	
	    }
	}
	
	
	public static void main(String[] args) {
		int[][] pairs = {{-10,-8}, {8,9}, {-6,-4}};
		
		
		
	}
}
