package com.itheima.extends001;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {

    }
class Person{
    public void eat(){
        System.out.println("吃饭饭");
    }
    public void drink(){
        System.out.println("喝水");
    }

}
class Student extends Person{
        public Student(){}
        public void lunch(){
            this.eat();
            this.drink();

            super.drink();
            super.eat();
        }
        public void study(){
            System.out.println("学习");
        }
    }
}
