
public class Java0407_8 {

	public static void main(String[] args) {
		int hap = 0;
		int i;
		myLabel: for (;;) { //���ѷ��� ������ ���� while(true) 
			for (i = 1; i <= 100; i++) {
				hap += i;
				if (hap > 2000) {
					System.out.println(hap);
					hap=0; //���� 0���� �ʱ�ȭ�ϰ� 
					//break;//�������� for ���� ��ž�� ��Ų��. 
					return; //while ���� ��ž��ų�� ���� //main �̶�� �Լ��� ������ �������� 
				}
			}
			System.out.println("������ �ݺ��� ");
		}

	}

}
