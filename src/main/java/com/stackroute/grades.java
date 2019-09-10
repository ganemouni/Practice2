package com.stackroute;

public class grades {
   public int[] check(int n,int[] grade){

       for(int j=0;j<grade.length;j++){
           if(grade[j]>100){
               return null;

           }
       }
       int max=0,min=100,avg=0;
       for(int i=0;i<grade.length;i++){

           if(grade[i]>max){
               max=grade[i];
           }
           if(grade[i]<min){
               min=grade[i];
           }
           avg=avg+grade[i];
       }
       avg=avg/n;
       int a[]={avg,min,max};


        return a;
    }
}
