package com.stackroute;

public class palindrome {
    public int check(int num){
        long a=0 ;
        long x=num;
        while(x!=0){
            a=(a*10)+(x%10);
            x=x/10;
        }
        if(a==num){
            return 1;

        }
        else{
            return -1;
        }
    }

}
