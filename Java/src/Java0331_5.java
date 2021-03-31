
public class Java0331_5 {

	int bbb = 0;// 클래스 전체에서 사용되는 (전역변수)
	public static void main(String[] args) {

	  
	int hap = 0;// Main 함수 실행되는 동안만 살아있는 변수 (지역변수)
      int i ;
      
      for(i=0;i<=10;i++) {
    	  
    	  
    	  int b= 0;//for 문 한번 돌 때만 살아있는 변수 
    	  hap+=i;
      }
	  System.out.println("1부터 10가지의 합 "+"="+hap);
		
		
		
		
	}

}
