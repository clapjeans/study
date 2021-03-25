import java.util.Scanner;

public class codeup1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] arr = a.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("q")) {
				System.out.println(arr[i]);
				break;
			}
			System.out.println(arr[i]);

		}
	}
}
