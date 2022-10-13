package com.String1.ArrayListDemo;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student st=new Student();
        Student s1=new Student("李云龙",22);
        Student s2=new Student("蔡徐坤",24);
        Student s3=new Student("程某",18);
        Student s4=new Student("国庆",88);


        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }

    }
}
