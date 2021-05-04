
public class Javaphone {

	public static void main(String[] args) {
		
		String phone_number="01033334444";
		String answer = "";
       
        	for(int i=phone_number.length();i>=0;i--){
                if(i<phone_number.length()-4){
                	answer+="*";
                
                }else{
             
                	answer+=phone_number.charAt(i);  
                	
                }
    
        	System.out.println(i);
	}System.out.println(answer);

}
}
