
import java.util.Scanner;

public class codeup1076 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char a = sc.nextLine().charAt(0);
		
		int b = a - 'a';
		for(int i = 0; i<b+1;i++) {
			System.out.println((char)('a'+i));
		}
	  
	
	}
}
