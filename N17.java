package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N17 {
	String[] letts =  { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	public List<String> letterCombinations(String digits) {
		
		
		
		List<String> result = new ArrayList<>();
		combination(digits, 0, result, "");
		
		return result;
		
	}
	
	public void combination(String digits,int n, List<String> res, String letter) {
		
		if(n>=digits.length()){
			res.add(letter);
			return;
		}
		
		String index = letts[(digits.charAt(n) - '0')];
		for(int i = 0; i < index.length(); i++){
			combination(digits, n + 1, res, letter + index.charAt(i));
		}
		
	}
	
public static void main(String[] args) {
	
	String[] letts =  { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	System.out.println(letts[2]);
	String a = letts[2];
	
	String digits = "32";
	System.out.println(digits.charAt(1) - '0');
	 
}
}
