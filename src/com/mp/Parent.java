package com.mp;

public class Parent {
    public static int i=0;
    static{
        System.out.println("parent====父类静态代码块");
    }
    {
        System.out.println("parent====父类普通代码块");
    }
    public Parent(){
        System.out.println("parent====父类无参构造方法");
    }
}
