package com.String1.StudentSystem;

public class User {
    private String username;
    private String password;
    private String bodyId;
    private String phoneId;

    public User (){}
    public User(String username,String password,String bodyId,String phoneId){
        this.username=username;
        this.password=password;
        this.bodyId=bodyId;
        this.phoneId=phoneId;
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

    public void setBodyId(String bodyId) {
        this.bodyId = bodyId;
    }

    public String getBodyId() {
        return bodyId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneId() {
        return phoneId;
    }

}
