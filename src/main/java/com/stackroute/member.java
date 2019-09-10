package com.stackroute;

class memberVaribale {

    public static void main(){
        member obj1=new member("Harry potter",30,2500.3f);
        System.out.println("Name is " +obj1.name);
        System.out.println("age is " +obj1.age);
        System.out.println("salary is " +obj1.salary);


    }

}
public  class member{
    String name;
    int age;
    float salary;
    member(String name,int age,float salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getname(){
        return this.name;
    }
    public int getSalary(){

        return (int)this.salary;
    }
    public int getage(){
        return this.age;
    }
}

