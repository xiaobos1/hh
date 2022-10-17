package com.itheima.Test002;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("李华");
        s.setAge(18);

        Teacher t=new Teacher();
        t.setName("王建国");
        t.setAge(38);

        Adminis a=new  Adminis();
        a.setName("管理员");
        a.setAge(30);

        GetUp(a);
        GetUp(t);
        GetUp(s);
    }
    public static void GetUp(Person p){
        p.show();
    }
}
