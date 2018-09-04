package leetcode;

public class N567 {
	public static void main(String[] args) {
		String a = "boa";
		String b = "eidboaoo";
		char c = a.charAt(1);
		
		
		System.out.println((b));
	}
	class Solution {
		public boolean checkInclusion(String s1, String s2) {
			if (s1.length() > s2.length()) {
				return false;
			}
			int[] temp1 = new int[26];
			int[] temp2 = new int[26];
			for (int i = 0; i < s1.length(); i++) {
				temp1[s1.charAt(i) - 'a']++;
				temp2[s2.charAt(i) - 'a']++;
			}
			
			for (int i = 0; i < s2.length() - s1.length(); i++) {
				if(matches(temp1, temp2))
					return true;
				temp2[s2.charAt(i + s1.length()) - 'a']++;
				temp2[s2.charAt(i) - 'a']--;
			}
			
			return matches(temp1, temp2);
		}
		
		public boolean matches(int[] temp1, int[] temp2) {
			for (int i = 0; i < 26; i++) {
				if (temp1[i] != temp2[i]) {
					return false;
				}
			}
			return true;
		}
	}
}
