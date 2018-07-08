package com.controlflow;


public class SumOddRange {
    
    
    public static void main(String args[]) {
    	
    	
    	System.out.println(isOdd(8));
    System.out.println(sumOdd(1,100));
    }
    public static boolean isOdd(int num)
    {
       
//        if(num>0)
//        {
//            
//            return true;
//        }
        if(num % 2==0)
        {
            return false;
        }else
        {
            return true;
        }
    }
    public static int sumOdd(int start,int end)
    {
        int sum=0;
        for(int i=start;i<end;i++)
        {
            
            if(i% 2==0)
            {
                
            }else
            {
            sum += i;
            System.out.println(i);
            }
            
        }
        return sum;
    }
        

}