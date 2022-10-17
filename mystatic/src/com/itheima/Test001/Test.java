package com.itheima.Test001;

public class Test {
    public static void main(String[] args) {
        Cook c=new Cook("001","张三",5000.0);

        Manager m=new Manager();
        m.setId("009");
        m.setName("李华");
        m.setSalary(10000.0);
        m.setBouns(8000.0);

        System.out.println(m.getId()+","+m.getName()+","+m.getSalary()+","+m.getBouns());
        m.work();
        System.out.println(c.getId()+","+c.getName()+","+c.getSalary());
        c.work();
    }
}
