package com.itheima.mystatic01;

public class StudentTest {
    public static void main(String[] args) {
        Student stu=new Student("张三",23,"男");
        stu.teacherName="阿伟老师";
        stu.show();
        stu.study();

        System.out.println("==================================");
        //
        Student stu1=new Student();
        stu1.setName("李四");
        stu1.setAge(23);
        stu1.setSex("女");
        stu1.show();
        stu1.study();
    }
}
