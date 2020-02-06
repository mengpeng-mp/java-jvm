package com.mp;

/**
 * 类的初始化
 */
public class App {
    public static void main(String[] args) {
        //1. 通过子类引用父类的静态字段，只会触发父类的初始化，而不会触发子类的初始化。
        //System.out.println(Child.i);
        /**输出结果
         * parent====父类静态代码块
         * 0
         */
        //2. 使用new实例化对象时，会先把父类初始化，然后再初始化此类本身
        //System.out.println(new Child());
        /**
         *parent====父类静态代码块
         * child====子类静态代码块
         * parent====父类普通代码块
         * parent====父类无参构造方法
         * child====子类普通代码块
         * child====子类无参构造方法
         * com.mp.Child@1b6d3586
         */
        //3.通过数组定义来引用类，不会触发此类的初始化
        //Child[] children = new Child[2];
        /**
         * "C:\Program Files\Java\jdk1.8.0_221\bin\java.exe" ...
         *
         * Process finished with exit code 0
         */
        //4.常量在编译期间会存入调用类的常量池中，本质上并没有直接引用定义常量的类，不会触发定义常量所在的类。
        //System.out.println(Child.cons);
        /**
         * 12
         */
        //5.通过类名获取 Class 对象，不会触发类的初始化。
        //System.out.println(Child.class);
        /**
         * class com.mp.Child
         */
        //6.通过 Class.forName 加载指定类时，如果指定参数 initialize 为 false 时，也不会触发类初始化，其实这个参数是告诉虚拟机，是否要对类进行初始化。
       /* try {
            Class.forName("com.mp.Child");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        /**
         * parent====父类静态代码块
         * child====子类静态代码块
         */
        try {
            Class.forName("com.mp.Child",false,Child.class.getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * 
         */
    }
}
