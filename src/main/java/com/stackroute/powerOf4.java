package com.stackroute;

public class powerOf4 {

    public int check(int num){
        int x=0;
        while(num!=1){
             x=num%4;
            if(x!=0){
                break;
            }
            num=num/4;
        }
        if(x==0){
            return 1;
        }
        else{
            return -1;
        }
    }
}
