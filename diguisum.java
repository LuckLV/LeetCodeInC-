package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class diguisum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testtime = null;

		System.out.println("输入数据：");
		testtime = br.readLine();
		String[] split = testtime.split(" ");
		int time = Integer.parseInt(split[0]);

		for (int t = 0; t < time; t++) {
			int count = 0;
			Set<String> num = new HashSet<>();
			ArrayList<Integer> a = new ArrayList<>();
			for (int i = 0; i < 2; i++) {
				testtime = br.readLine();
				split = testtime.split(" ");

				for (int j = 0; j < split.length; j++) {
					a.add(Integer.parseInt(split[j]));
				}
				
			}
			Sumall(a, num, a.get(1), "", 2);
			System.out.println(num);

		}

//		ArrayList<Integer> list1 = new ArrayList<>();
//		list1.add(4);
//		list1.add(10);
//		list1.add(1);
//		list1.add(2);
//		list1.add(5);
//		list1.add(10);
//
//		List<List<Integer>> list = new ArrayList<>();
//
//		backtrack(list, new ArrayList<Integer>(), list1, 5, 2);
//		System.out.println(list);
	}

	public static void Sumall(ArrayList<Integer> array, Set<String> num,
			int sum, String word, int start) {

		if (sum < 0)
			return;
		else if (sum == 0)
			num.add(word);
		else {
			for (int i = start; i < array.size(); i++) {
				int a = (int) array.get(i);
				Sumall(array, num, sum - a, word + a, i);
			}
		}
	}

	public static void backtrack(List<List<Integer>> list,
			List<Integer> tempList, ArrayList<Integer> list1, int remain,
			int start) {
		if (remain < 0)
			return;
		else if (remain == 0)
			list.add(new ArrayList<>(tempList));
		else {
			for (int i = start; i < list1.size(); i++) {
				tempList.add(list1.get(i));
				backtrack(list, tempList, list1, remain - list1.get(i), i);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

}
