package com.String1.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登录,2.注册,3.忘记密码");

            Scanner sc = new Scanner(System.in);
            System.out.println("请选择");
            String choose = sc.next();

            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgot(list);
                case "4" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }

        }
    }

    //登录
    public static void login(ArrayList<User> list) {

    }

    //注册
    public static void register(ArrayList<User> list) {
        //创建用户
        //User u =new User();
        String username;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("请输入用户名");
            username = sc.next();
            boolean flag = checkUsername(username);
            if (!flag) {
                System.out.println("不满足条件重新录入");
                continue;
            }
            boolean flag1= contains(list, username);
            if(flag1){
                System.out.println("用户名"+username+"存在请重新输入");
            }else{
                System.out.println("用户名"+username+"可用");
                break;
            }
        }
        //键盘输入密码
        String password;
        while (true) {
            System.out.println("请输入要注册的密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            String newpassword = sc.next();
            if (!password.equals(newpassword)) {
                System.out.println("俩次密码不一致，请重新输入");
                continue;
            }else{
                System.out.println("继续录入");
                break;
            }
        }
        //身份证验证
        String bodyid;
        while (true) {
            System.out.println("请输入身份证号");
            bodyid = sc.next();
            boolean flag2=checkbodyId(bodyid);
            if(flag2){
                System.out.println("满足条件");
                break;
            }else{
                System.out.println("身份证格式错误，请重新输入");
                continue;
            }

        }
        //键盘录入手机号码
        String phoneId;
        while (true) {
            System.out.println("输入手机号码");
            phoneId = sc.next();
            boolean flag4 = checkPhone(phoneId);
            if (flag4) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式错误，请重新输入");
                continue;
            }
        }

        User u =new User(username,password,bodyid,phoneId);
        System.out.println("注册成功");
        list.add(u);
        //遍历
        printf(list);
    }
    public static void printf(ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            System.out.println(u.getUsername()+","+u.getPassword()+","+u.getBodyId()+","+u.getPhoneId());
        }
    }
    //手机号码
    public static boolean checkPhone(String phoneId){
        //长度11位
        if(phoneId.length() !=11){
            return false;
        }
        //不能0开头
        if(phoneId.startsWith("0")){
            return false;
        }
        //必须是数字
        for (int i = 0; i < phoneId.length(); i++) {
            char c=phoneId.charAt(i);
            if(!(c>='0'&&c<='9')){

                return false;
            }
        }
        return true;
    }

        //身份证验证
    public static boolean checkbodyId(String bodyid){
        int len=bodyid.length();
        if(len !=18){
            return false;
        }
        //不能0开头
        if(bodyid.charAt(0) =='0'){
            return false;
        }
        //前17位是数字
        for (int i = 0; i < bodyid.length(); i++) {
            char c=bodyid.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        //最后一位
        char endchar=bodyid.charAt(bodyid.length()-1);
        if((endchar >= '0'&&endchar<='9')||(endchar == 'x')||(endchar=='X')) {
            return true;
        }else{
            return false;
        }
    }
    public static boolean contains(ArrayList<User> list,String username){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            String rightName=u.getUsername();
            if(rightName.equals(username)){
                return true;
            }
        }
        return false;
    }
    public static boolean checkUsername(String username){
        //字符长度大于三并且小于15
        //不在这些范围去FALSE
        int len=username.length();
        if(len<3||len>15){
            return false;
        }

        //每个字符在a~z，A~Z ，0~9之间没有其他特殊字符
        //不在就取false
        for (int i = 0; i < username.length(); i++) {
            char c=username.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c<='0'&&c>='9')){
                return true;
            }else {
                return false;
            }
        }
        //3.不能是纯数字
        int count =0;
        for (int i = 0; i < username.length(); i++) {
            char h=username.charAt(i);
            if((h >='a'&&h <='z')||(h >='A'&&h <='Z')){
                count++;
                break;
            }
        }
        return count>0;
    }

    //忘记密码
    public static void forgot(ArrayList<User> list) {

    }
}