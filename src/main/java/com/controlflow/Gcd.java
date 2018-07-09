package com.controlflow;

public class Gcd {
    // write your code here
    
	public static int getGreatestCommonDivisor(int num,int num1)
    {
        int gct=0;
        int i=0;
        if(num <0)
        {
    		 System.out.println("ssdddff");
           return -1;
           
        }
        
        for( i=1; i<=num && i<=num1;i++)
        {
        	
        	
        	
       
        		if(num % i==0 && num1 % i==0) {
                gct=i;
        		}
            
           
        }
        System.out.println(gct);
        return gct;
    }
	public static void main (String ar[])
	{
		getGreatestCommonDivisor(-25,15);
	}
}