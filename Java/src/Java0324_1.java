
public class Java0324_1 {

	public static void main(String[] args) {
		String str1 = "IT CookBook �Դϴ�.";
		String str2 = "10";
		String str3 = "20";

		str1 = "Java �Դϴ�."; //str1 ó�������� ���������� �ʱ�ȭ�ؼ� ���ο�� �־��� . 
		
		System.out.printf("%s \n", str1);
		System.out.printf("%S \n", str2 + str3);
		
		System.out.println("str 1 :"+ str1);
		System.out.println("���ϱ� ���"+str1 +str3);
		
		int num1 =Integer.parseInt(str2);
		int num2 =Integer.parseInt(str3);
		System.out.println("���ϱ� ��� : "+ (num1 +num2));
	
			
	
	
	}

}
