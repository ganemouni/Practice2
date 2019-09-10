package com.stackroute;

public class factorial {
    public int fact(int n){
        int num=1;
        if(n<=12){
            for(int i=1;i<=n;i++){
                num=num*i;
                System.out.println("The factorial of "+i+" is "+num);


            }
            return num;
        }
            else{
                for(int i=1;i<=12;i++){
                    num=num*i;
//                    System.out.println("The factorial of "+n+" is "+num);


                }
                System.out.println("The factorial of "+n+" is out of range");
            return -1;

            }
    }
    public long longfact(long n){
        long num=1;
        if(n<=20){
            for(long i=1;i<=n;i++){
                num=num*i;
                System.out.println("The factorial of "+i+" is "+num);


            }
            return num;
        }
        else{

            System.out.println("The factorial of "+n+" is out of range");
            return -1;

        }
    }


}



