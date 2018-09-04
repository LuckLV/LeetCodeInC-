package leetcode;

public class N387 {

	class Solution {
	    public int firstUniqChar(String s) {
	    	
	    	char[] sc = s.toCharArray();
	    	
	    	boolean temp = true;
	    	
	    	for(int i = 0; i < sc.length; i++){
	    		
	    		temp = true;
	    		
	    		for(int j = 0; j < sc.length; j++){
	    			if((sc[i] == sc[j]) && (i != j)){
	    				temp = false;
	    				break;
	    			}
	    		}
	    		
	    		if(temp == true)
	    			return i;    		
	    	}
			return -1;
	        
	    }
	    
	}

}
