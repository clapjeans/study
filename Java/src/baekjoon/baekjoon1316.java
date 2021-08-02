package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		String gru[] = new String[n];

		for (int i = 0; i < n; i++) {
			gru[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			abc: for (int j = 0; j < gru[i].length() - 1; j++)
				if (gru[i].charAt(j) != gru[i].charAt(j + 1)) {
					if (j + 1 != gru[i].indexOf(gru[i].charAt(j + 1))) {
						count -= 1;
						break abc;
					}
				}
		}
		System.out.println(count);

	}

}
