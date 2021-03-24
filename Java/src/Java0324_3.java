
public class Java0324_3 {

	public static void main(String[] args) {
		int a = 10;

		a++;
		System.out.println(a); //11 출력 
		System.out.println("a++ :" + a++); //11 그대로 출력  변위연산자 후위연산자 먼저실행하냐 나중에실행하는가 

		System.out.println(a); // ++가 증감되어 12 출력 
		
		System.out.println("++a :" + ++a); // 앞에 있는 ++ 함수 실행후 (+1) 후 13 출력  전위연산자 
		
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
