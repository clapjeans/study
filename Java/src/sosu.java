import java.util.Scanner;

public class sosu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;

		int a = scan.nextInt();
		
		abc : for (int i = 2; i <=a; i++) {
          int root = (int)Math.sqrt((double) i);
			for (int j = 2; j < root+1; j++) {

				if (i % j == 0) {
					
					continue abc;
				}

			
			}
			
			count ++;
		}

		System.out.println(count);
	}

}
