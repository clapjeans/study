
public class Java0407_2 {

	public static void main(String[] args) {
//for 문 구구단
		int i, j;
		for (i = 2; i < 10; i++) {
			System.out.println("["+i+"]단");
			for (j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println();
		}
	}

}
