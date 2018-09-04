package leetcode;

public class N461 {
	public int hammingDistance(int x, int y) {
		
		int z = x^y;
		
		String a = Integer.toBinaryString(x^y).replaceAll("0", "");
		return a.length();
        
    }
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(1^4).replaceAll("0", ""));
	}
}
