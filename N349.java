package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class N349 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		
		Set<Integer> num = new HashSet<>();
		Set<Integer> intersect = new HashSet<>();
		
		for(int i = 0; i < nums1.length; i++){
			num.add(nums1[i]);
		}
		
		for(Integer s : num){
			System.out.println(s);
		}
		
		for(int i = 0; i < nums2.length; i++){
			if(num.contains(nums2[i])){
				intersect.add(nums2[i]);
				
			}
		}
		
		for(Integer s : intersect){
			System.out.println(s);
		}
		
		int[] inters = new int[intersect.size()];
		int i = 0;
		for(Integer s : intersect){
			inters[i++] = s;
		}
		
		return inters;
		
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1};
		int[] nums2 = {1};
		
		int[] num = intersection(nums1, nums2);
		for(int i = 0; i < num.length; i++){
		System.out.println(num[i]);
		}
	}
	
}
