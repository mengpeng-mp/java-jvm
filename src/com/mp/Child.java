package com.mp;

public class Child extends Parent {
    public static int count=0;
    public static final int cons=12;
    static{
        System.out.println("child====子类静态代码块");
    }
    {
        System.out.println("child====子类普通代码块");
    }
    public Child(){
        System.out.println("child====子类无参构造方法");
    }
}
