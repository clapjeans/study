
import java.util.Scanner;

public class Java0407_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;

		while (true) { // ���ѷ����̴�.

			System.out.println("ù��° �Է°� :");
			a = scan.nextInt();
			System.out.println("�ι�° �Է� �� : ");
			b = scan.nextInt();

			System.out.println("�հ� :" + (a + b));
			// �հ谡 10���� ũ�鳪����
			if ((a + b) > 10) {
				break;
			}
		}

	}

}
