package com.String1.ArrayListDemo;

public class User {
    private int id;
    private String username;
    private String password;

    //空参
    public User(){}
    //含参
    public User(int id,String username,String password){
        this.id=id;
        this.username=username;
        this.password=password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
