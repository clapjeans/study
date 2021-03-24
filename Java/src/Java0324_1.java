
public class Java0324_1 {

	public static void main(String[] args) {
		String str1 = "IT CookBook 입니다.";
		String str2 = "10";
		String str3 = "20";

		str1 = "Java 입니다."; //str1 처음변수를 날려버리고 초기화해서 새로운값을 넣어줌 . 
		
		System.out.printf("%s \n", str1);
		System.out.printf("%S \n", str2 + str3);
		
		System.out.println("str 1 :"+ str1);
		System.out.println("더하기 결과"+str1 +str3);
		
		int num1 =Integer.parseInt(str2);
		int num2 =Integer.parseInt(str3);
		System.out.println("더하기 결과 : "+ (num1 +num2));
	
			
	
	
	}

}
