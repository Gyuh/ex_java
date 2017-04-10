package codeground;

import java.util.Scanner;

public class number_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;
		int cnt;
		int res1;
		TC = sc.nextInt();
		for (test_case = 1; test_case <= TC; test_case++) {
			int res = 0;
			cnt = sc.nextInt();

			for (int i = 0; i < cnt; i++) {
				res1 = sc.nextInt();
				res ^= res1;
			}
			System.out.println("Case #" + test_case);
			System.out.println(res);
		}
		sc.close();
	}
}
