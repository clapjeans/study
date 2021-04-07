
import java.util.Scanner;

public class Java0407_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;

		while (true) { // 무한루프이다.

			System.out.println("첫번째 입력값 :");
			a = scan.nextInt();
			System.out.println("두번째 입력 값 : ");
			b = scan.nextInt();

			System.out.println("합계 :" + (a + b));
			// 합계가 10보다 크면나가지
			if ((a + b) > 10) {
				break;
			}
		}

	}

}
