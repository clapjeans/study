
public class Java0324_3 {

	public static void main(String[] args) {
		int a = 10;

		a++;
		System.out.println(a); //11 ��� 
		System.out.println("a++ :" + a++); //11 �״�� ���  ���������� ���������� ���������ϳ� ���߿������ϴ°� 

		System.out.println(a); // ++�� �����Ǿ� 12 ��� 
		
		System.out.println("++a :" + ++a); // �տ� �ִ� ++ �Լ� ������ (+1) �� 13 ���  ���������� 
		
		a--;
		System.out.println(a);

		a += 5;
		System.out.println(a);
		a -= 5;
		System.out.println(a);
		a *= 5;
		System.out.println(a);
		a /= 5;
		System.out.println(a);
		a %= 5;
		System.out.println(a);
	}

}
