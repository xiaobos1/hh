package com.String1.StudentSystem;

import java.util.ArrayList;
import java.util.Random;
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
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username=sc.next();
            //判断用户是否存在
            boolean flag=contains(list,username);
            if(!flag){
                System.out.println("用户名不存在请先注册");
                return;
            }
            System.out.println("请输入密码");
            String password=sc.next();


            //验证码判断
            while(true) {
                String rightCode = getCode();
                System.out.println("正确验证码为" + rightCode);
                System.out.println("请输入验证码");
                String setCode = sc.next();
                if (rightCode.equals(setCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误");
                    continue;
                }
            }

            //定义一个方法验证用户名密码是否正确
            User userInfo=new User(username,password,null,null);
            boolean flag1=checkUserInfo(list,userInfo);
            if(flag1){
                System.out.println("登录成功");
                StudentSystem ss=new StudentSystem();
                ss.startStudentSystem();
                break;

            }else{
                System.out.println("登录失败，用户名或密码错误");
                if(i==2){
                    System.out.println("当前账号"+username+"被锁定请隔10分钟在尝试");
                    return;
                }else{
                    System.out.println("账户或密码错误，还剩下"+(2-i)+"次");
                }
            }

        }
//        //验证码判断
//        while(true) {
//            String rightCode = getCode();
//            System.out.println("正确验证码为" + rightCode);
//            System.out.println("请输入验证码");
//            String setCode = sc.next();
//            if (rightCode.equals(setCode)) {
//                System.out.println("验证码正确");
//                break;
//            } else {
//                System.out.println("验证码错误");
//                continue;
//            }
//        }
//        System.out.println("请输入用户名");
//        String username=sc.next();
//        //判断用户是否存在
//        boolean flag=contains(list,username);
//        if(!flag){
//            System.out.println("用户名不存在请先注册");
//            return;
//        }
//        System.out.println("请输入密码");
//        String password=sc.next();
//
//        //验证码判断
//        while(true) {
//            String rightCode = getCode();
//            System.out.println("正确验证码为" + rightCode);
//            System.out.println("请输入验证码");
//            String setCode = sc.next();
//            if (rightCode.equals(setCode)) {
//                System.out.println("验证码正确");
//                break;
//            } else {
//                System.out.println("验证码错误");
//                continue;
//            }
//        }
//
//        //定义一个方法验证用户名密码是否正确
//        User userInfo=new User(username,password,null,null);
//        boolean flag1=checkUserInfo(list,userInfo);
//        if(flag1){
//            System.out.println("登录成功");
//        }else{
//            System.out.println("登录失败，用户名或密码错误");
//        }
    }

    //判断账号密码是否正确
    public static boolean checkUserInfo(ArrayList<User> list,User userInfo){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            if(u.getUsername().equals(userInfo.getUsername())&&u.getPassword().equals(userInfo.getPassword())){
                 return true;
            }
        }
        return false;
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
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=sc.next();

        boolean flag=contains(list,username);
        if(!flag){
            System.out.println(username+"用户不存在");
            return ;
        }
        //存在
        System.out.println("请输入身份证号码");
        String bodyId=sc.next();
        System.out.println("请输入手机号码");
        String phoneId=sc.next();

        //当前身份证号码和手机号码
        //通过索引获取对象
        int index=findIndex(list,username);
        User user=list.get(index);

        //比较当前用户的身份证号码和手机号码是否一致
        if(!(user.getBodyId().equals(bodyId)&& user.getPhoneId().equals(phoneId))){
            System.out.println("当前用户的身份证号码和手机号码有误，不能修改密码");
            return;
        }

        //修改密码
        while(true) {
            System.out.println("请输入新的密码");
            String password = sc.next();
            System.out.println("请再一次输入新的密码");
            String newPassword = sc.next();

            if (password.equals(newPassword)) {
                System.out.println("俩次密码一致");
                break;
            } else {
                System.out.println("俩次密码不一致重新输入");
            }
        }
    }
   //获取用户的索引
    public static int findIndex(ArrayList<User> list,String username){
        for (int i = 0; i < list.size(); i++) {
            User user=list.get(i);
            if(user.getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }

    //生成验证码
    private static String getCode(){
        //创建集合
        ArrayList<Character> list=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        //System.out.println(list);
        //随机索引
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(list.size());
            char c=list.get(index);
            sb.append(c);
        }
        int num=r.nextInt(10);
        sb.append(num);

        //
        char[] arr=sb.toString().toCharArray();
        int rand=r.nextInt(arr.length);
        char tmp=arr[rand];
        arr[rand]=arr[arr.length-1];
        arr[arr.length-1]=tmp;

        return new String(arr);
    }
//    public static String getCode(){
//        //创建集合
//        ArrayList<Character> list=new ArrayList<>();
//        for (int i = 0; i < 26; i++) {
//            list.add((char)('a'+i));
//            list.add((char)('A'+i));
//        }
//
//
//    }
}