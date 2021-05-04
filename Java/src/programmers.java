
public class programmers {

	public static void main(String[] args) {
		String answer = "";
		String s = "try hello world";
		int cnt = 0;
		String[] arr = s.split("");		
		for(int i=0; i<arr.length; i++)
		{
			cnt = (arr[i].contains(" ")) ? 0 : cnt+1;
			
			if(cnt%2 == 0)
				answer += arr[i].toLowerCase();
			
			else
				answer += arr[i].toUpperCase();
		}
		
		System.out.println(answer);
	}

}



		    
		        