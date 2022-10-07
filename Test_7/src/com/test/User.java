package com.test;

public class User {
    private String name;
    private String password;
    private String email;
    private String sex;
    private int age;

    //空参
    public User(){}
    //含参
    public User(String name,String password,String email,String sex,int age){
        this.name=name;
        this.password=password;
        this.email=email;
        this.sex=sex;
        this.age=age;
    }
    //name
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    //password
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    //email
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    //sex
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    //age
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
