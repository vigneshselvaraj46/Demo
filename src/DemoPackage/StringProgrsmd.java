package DemoPackage;

public class StringProgrsmd {

	public static void main(String[] args) {
     
		
		   String string = "The";    
	        int count = 0;    
	        System.out.println("Total number of characters in a string: " + string.length());    
 
	        
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++)
	        {    
	            System.out.println(  string.charAt(i)  );  
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);    
	}

}
