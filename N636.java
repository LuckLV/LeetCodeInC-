package leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class N636 {
	public int[] exclusiveTime(int n, List<String> logs) {
		
int[] runTime = new int[n];
		
		Stack<Integer> f = new Stack<>();
		int pre = 0;
		int setime;
        int id;
		for (String log : logs) {
			String[] tmp = log.split(":");
            setime = Integer.parseInt(tmp[2]);
            
			if (tmp[1].equals("start")) {
				
				id = Integer.parseInt(tmp[0]);
				if (f.isEmpty()) {
					f.push(id);
					pre = setime;
				}else{
					runTime[f.peek()] += setime - pre;				
					f.push(id);
					pre = setime;
				}
				
			}else{
				runTime[f.peek()] += setime - pre + 1;
				f.pop();
				pre = setime + 1;
            }
			
		}
	
		return runTime;
	}
}
