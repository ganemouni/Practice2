package com.stackroute;

public class user {
     private String firstName;
    private String lastName;
    private int age;
    private float salary;
    user(String firstName,String lastName,int age,float salary){

        this.lastName=lastName;
        this.age=age;
        this.firstName=firstName;
        this.salary=salary;
    }
    public boolean isvalidage(){
        if(age>18&&age<60){
            return true;
        }
        else
        {
            return false;
        }
    }
    public String getFullName(){
        return firstName+" "+lastName;
    }
}
