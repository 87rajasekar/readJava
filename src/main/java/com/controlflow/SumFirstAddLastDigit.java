package com.controlflow;

public class SumFirstAddLastDigit {
    
    
    
    public static boolean  sumFisrtAndLastDigit(int num)
    {
        
        if(num <1)
        {
            
            return false;
        }
        int last=num%10;
        int first=0;
        int n=0;
        while( n >=1)
        {
            first=n/10;
        
        }
        System.out.println(first+last);
        return true;
        
    }
    
}