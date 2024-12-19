package DemoPackage;

import java.util.Scanner;

public class PercentageDiscountCalculator {

	    public static void main(String[] args) 
	    {
	    	  int number=544;
	    	  int temp=number;
	    	  int rev= 0;
	    	  int rem;
	    	  while (temp>0)
	    	  {
	    		  rem=temp%10;
	    		  rev=rev*10+rem;
	    		  temp=temp/10;
	    	     
	    	}
             if (rev==number) {
                 System.out.println("number is pallindrome");

             }else {
                 System.out.println("number is not pallindrome");

             }
	    
	    }
	}


