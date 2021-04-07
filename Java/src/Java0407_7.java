import java.util.Scanner;

public class Java0407_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu;

		do {
			System.out.println("손님 주문하시겠습니까?");
			System.out.println("1.카페라떼 2.카푸치노 3. 아메리카노 4.그만시킬께요");

			menu = scan.nextInt();

			switch (menu) {

			case 1:
				System.out.println("카페라떼 주문 하셨습니다.");
				break;
			case 2:
				System.out.println("카푸치노 주문하셨습니다.");
				break;

			case 3:
				System.out.println("아메리카노 주문하셨습니다.");
				break;

			case 4:
				System.out.println("주문하신커피 나왔습니다.");
				break;

				
			default:
				System.out.println("카푸치노 주문하셨습니다.");
				break;

			}

		} while (menu != 6);

	}
}