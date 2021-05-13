import java.util.Arrays;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {

		/*
		 * long a = 12345; int[] answer = new int[String.valueOf(a).length()]; int num =
		 * 0;
		 * 
		 * while (true) { if (a == 0) { break;
		 * 
		 * }
		 * 
		 * answer[num++] = (int) a % 10; a/=10;
		 * 
		 * } System.out.println(Arrays.toString(answer));
		 * 
		 */

		long a = 12345;
		String b = String.valueOf(a);
		String Temp[] = b.split("");
		int answer[] = new int[Temp.length];
		int j=0;
		for (int i = Temp.length-1; i>=0; i--) {
			answer[j] = Integer.parseInt(Temp[i]);
			j++;
			
		}
System.out.println(Arrays.toString(answer));
	}

}
