package com.test;

public class UserTest {
    public static void main(String[] args) {
        User u=new User("江峰","123456","@163.com","男",19);
//        u.setName("狗娃");
//        u.setPassword("65323");
//        u.setEmail("@qq.com");
//        u.setSex("女");
//        u.setAge(22);
        System.out.println(u.getName());
        System.out.println(u.getPassword());
        System.out.println(u.getEmail());
        System.out.println(u.getSex());
        System.out.println(u.getAge());


    }
}
