
public class Java0317 {

	public static void main(String[] args) {
		int a, b, c, d;

		a = 100 + 100;
		b = a + 100;
		c = a + b - 100;
		d = a + b + c; // =하나는 값을 지정하는 것
		System.out.printf("%d,%d,%d,%d", a, b, c, d);
		System.out.println();
		
		a=b=c=d=100;
		System.out.println("a :"+a);
		System.out.println("d :"+b);
		System.out.println("c :"+c);
		System.out.println("d :"+d);
		
		a=100;
		a=a+200;
		System.out.println(a);
// "  : "
		
		
	}

}
