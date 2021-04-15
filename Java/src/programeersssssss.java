
public class programeersssssss {

	public static void main(String[] args) {
		String answer="";
		String s = "try hello world";
	        int cnt =0;
	       String [] arr = s.split("");
			        
			            for (int i=0;i<arr.length;i++){
	                        
	                cnt = (arr[i].contains(" ")) ? 0 : cnt+1;


			               if(cnt%2!=0){
			              arr[i]=arr[i].toUpperCase();
			         
	                          
			              
			           }
			            else {
			            	 arr[i]=arr[i].toLowerCase();
	                    
			            }
	            
	                    
	                    
			               answer+=arr[i];
	                    }
	         System.out.println(answer); 
	        
	    }
	        
	

	}


