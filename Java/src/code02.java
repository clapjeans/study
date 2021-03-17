import java.util.Scanner;

public class code02 {

	public static void main(String[] args) {



		Scanner c = new Scanner(System.in);

		
		String a = c.nextLine();
		String[] arr = a.split("-");
		String A = arr[0];
		String b = arr[1];

		
		System.out.printf(A+b);
		
	}

}
