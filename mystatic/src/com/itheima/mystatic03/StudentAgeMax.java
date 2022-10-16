package com.itheima.mystatic03;

import java.util.ArrayList;

public class StudentAgeMax {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student s1=new Student("li",34,"man");
        Student s2=new Student("liji",14,"man");
        Student s3=new Student("lixio",24,"man");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int i = ageMax.maxAge(list);
        System.out.println(i);
    }


}
