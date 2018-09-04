package leetcode;

public class N517 {

	class Solution{
		public int findMinMoves(int[] machines) {
			
			
			int max = 0;
			int sum = 0;
			
			for (int i = 0; i < machines.length; i++) {
				
				if (machines[i] > max) {
					max = machines[i];
				}
				sum += machines[i];
			}
			 
			if (sum % machines.length == 0) {
				int avg = sum / machines.length;
				int move = 0;
				for (int i = 0; i < machines.length; i++) {
					if ((machines[i] - avg) > 0) {
						move += machines[i] - avg;
					}
				}
				return move;
			} else {
				return -1;
			}
		}
	}
	
}
