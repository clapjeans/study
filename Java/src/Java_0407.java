
public class Java_0407 {

	public static void main(String[] args) {

		int i;
		for (i = 1; i < 101; i++) {

			if (i % 3 == 0 && i % 5 == 0)
			//i%15==0;
			{
				System.out.println("[3의배수또는 5의 배수]" + i);
			}

		}

	}

}
