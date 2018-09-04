package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N784 {
	public static List<String> letterCasePermutation(String S) {
        if (S == null) {
           return new LinkedList<>();
       }
       Queue<String> queue = new LinkedList<>();
       queue.offer(S);
       queue.offer("ccdd");
       
       for (int i = 0; i < S.length(); i++) {
           if (Character.isDigit(S.charAt(i))) continue;                   
           int size = queue.size();
           for (int j = 0; j < 1; j++) {
               String cur = queue.poll();
               char[] chs = cur.toCharArray();
               System.out.println(cur);
               
               chs[i] = Character.toUpperCase(chs[i]);
               queue.offer(String.valueOf(chs));
               System.out.println(queue);
               
               chs[i] = Character.toLowerCase(chs[i]);
               queue.offer(String.valueOf(chs));
               System.out.println(queue);
           }
       }
       
       return new LinkedList<>(queue);
   }
	
	
	public static void main(String[] args) {
		List<String> link = 
		letterCasePermutation("a1b2");
		//System.out.println(link);
	}
}
