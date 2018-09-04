package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]*/

public class N90 {
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 2};
		List<List<Integer>> results = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        testList(results, res);
		N90 test = new N90();
		System.out.println(results);
		
	}
	
	public static void testList(List<List<Integer>> results, List<Integer> res) {
		res.add(6);
		results.add(res);
		
	}
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        findRes(results, res, nums, 0);
        
        return results;
    }
	
	private void findRes(List<List<Integer>> results, List<Integer> res, int[] nums, int flag){
		
		if (flag <= nums.length) {
			results.add(new ArrayList<>(res));
		}
		
		for (int i = flag; i < nums.length; i++) {
			if (i > flag && nums[i]==nums[i - 1]) {
				continue;
			}
			
			res.add(nums[i]);
			findRes(results, res, nums, i + 1);
			res.remove(res.size() - 1);
			
		}
		
	}
	
	
	
    
	
}
