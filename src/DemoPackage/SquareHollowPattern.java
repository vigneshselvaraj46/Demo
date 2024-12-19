package DemoPackage;
import java.util.Scanner; 
public class SquareHollowPattern {
    public static void main(String[] args) {
        
    System.out.println("enter the number");
    Scanner SC =new Scanner(System.in);
    int n = SC.nextInt();
        char ch='A';

        for (int i = 1; i <= n; i++) 
        {
        	for (int j=1; j<=n; j++) 
        		
        	{  
        		if (i==j||i+j==n+1)
        		{
        		
                System.out.print("*");
                
                }
        		else 
        		{
                   System.out.print(" ");
                   
                   
                }

        	}
            System.out.println();

        		
        }}
        }
  


