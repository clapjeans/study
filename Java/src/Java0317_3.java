
public class Java0317_3 {

	public static void main(String[] args) {
//char 우리눈에는 문자값을 저장하지마 실제 값은 65
		//char a a='A' >>(int)a 강제로 전환하면 65가 나옴 
		
		char b,c; 
		
		b='a'; // a=97
		c=(char)(b+1); //(97+1)>>98을 문장열로 변환해서 출력
		
	System.out.println((int)b);
		
	}

}
