package com.itheima.Test001;

public class Empolyee {
    private String id;
    private String name;
    private double salary;

    public Empolyee(){
    }
    public Empolyee(String id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void work(){
        System.out.println(name+"在工作");
    }
    public void eat(){
        System.out.println(name+"在吃饭");
    }
}
