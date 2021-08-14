package baekjoon;

import java.util.Scanner;

public class baekjoon10872 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 1;
		for (int i = n; i > 0; i--) {
			if (n == 0)
				System.out.println(1);
			count *= i;

		}
		System.out.println(count);
	}

}
