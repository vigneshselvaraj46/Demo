package DemoPackage;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String A = sc.next();
		
		System.out.println(A);
		
    
          int a[][]=new int [2][2];
           a[0][0]=100;
           a[0][1]=200;
           a[1][0]=300;
           a[1][1]=400;
          
        try {
        	for(int i=0;i<=a.length;i++)
        	{
            	for(int j=0;j<=a[i].length;j++) 
            	{

                     System.out.println(a[i][j]);
                 }
        	}
        }
        catch(Exception e) {
            System.out.println(e);

        }
        
        
	

	}

}
