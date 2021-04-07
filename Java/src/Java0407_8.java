
public class Java0407_8 {

	public static void main(String[] args) {
		int hap = 0;
		int i;
		myLabel: for (;;) { //무한루프 돌리는 것임 while(true) 
			for (i = 1; i <= 100; i++) {
				hap += i;
				if (hap > 2000) {
					System.out.println(hap);
					hap=0; //값을 0으로 초기화하고 
					//break;//엄마까지 for 문만 스탑을 시킨다. 
					return; //while 까지 스탑시킬수 있음 //main 이라는 함수를 완전히 끝내버림 
				}
			}
			System.out.println("아직도 반복중 ");
		}

	}

}
