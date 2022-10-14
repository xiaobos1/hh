package com.String1.StudentSystem;

public class Student {
    private String id;
    private String name;
    private int age;
    private String place;

    public Student(){}
    public Student(String id,String name ,int age,String place){
        this.id=id;
        this.name=name;
        this.age=age;
        this.place=place;
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}
