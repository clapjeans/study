import java.util.Scanner;

public class Java0331_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("점수를 입력하세요.");
		a = sc.nextInt();

		if (a >= 90) {
			System.out.println();
		} else {
			if (a >= 90) {
				System.out.println("A");

			} else {
				if (a >= 80)
					System.out.println("B");

			}

		}

	}

}
