package com.String1.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        ArrayList<Student> list= new ArrayList<>();
        boolean f=true;
        while(f) {
            System.out.println("--------- xx学生管理系统 ---------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("退出");

            Scanner sc = new Scanner(System.in);
            System.out.println("输入你的选择：");
            String choose = sc.next();
            switch (choose) {
                case "1" -> AddStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> selectStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    f=false;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void AddStudent(ArrayList<Student> list){
        Student st=new Student();
        Scanner sc=new Scanner(System.in);
        while(true){
           System.out.println("输入学生id");
           String id=sc.next();
           boolean flag=contains(list,id);
           if(flag){
               System.out.println("id已经存在");
           }else {
               st.setId(id);
               break ;
           }
       }

        System.out.println("输入姓名");
        String name=sc.next();
        st.setName(name);

        System.out.println("输入年龄");
        int age=sc.nextInt();
        st.setAge(age);

        System.out.println("输入地址");
        String p=sc.next();
        st.setPlace(p);

        list.add(st);
        //提示
        System.out.println("添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner s=new Scanner(System.in);
        System.out.println("输入要删除id");
        String id=s.next();

        int index=getIndex(list,id);

        if(index>=0){
            list.remove(index);
            System.out.println("删除成功");
        }else{
            System.out.println("没有内容删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要修改id");
        String id=sc.next();
        int index=getIndex(list,id);

        if(index==-1){
            System.out.println("当前"+id+"不存在");
            return;
        }

        Student st=list.get(index);

        System.out.println("修改姓名");
        String name=sc.next();
        st.setName(name);

        System.out.println("修改年龄");
        int age=sc.nextInt();
        st.setAge(age);

        System.out.println("修改地址");
        String p=sc.next();
        st.setPlace(p);
        System.out.println("修改成功");
//        Student st=new Student();
//
//        System.out.println("输入要修改id");
//        String id=sc.next();
//
//        int index=getIndex(list,id);
//
//        if(index>=0){
//            while(true){
//                System.out.println("输入学生id");
//                String sid=sc.next();
//                boolean flag=contains(list,sid);
//                if(flag){
//                    System.out.println("id已经存在");
//                }else {
//                    st.setId(id);
//                    break ;
//                }
//            }
//
//            System.out.println("输入姓名");
//            String name=sc.next();
//            st.setName(name);
//
//            System.out.println("输入年龄");
//            int age=sc.nextInt();
//            st.setAge(age);
//
//            System.out.println("输入地址");
//            String p=sc.next();
//            st.setPlace(p);
//
//            list.add(st);
//            System.out.println("修改成功");
//        }
    }

    //打印
    public static void selectStudent(ArrayList<Student> list){
        if(list.size()==0){
            System.out.println("无学生信息，请添加后再查询");
            return;
        }
//        System.out.println("查询学生");
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student st=list.get(i);
            System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getAge()+"\t"+st.getPlace());
        }
    }


    //判断id是否存在
    public static boolean contains(ArrayList<Student> list,String id){
//        for (int i = 0; i < list.size(); i++) {
//            Student stu=list.get(i);
//            String sid=stu.getId();
//            //存在，TRUE  不存在false
//            if(sid.equals(id)){
//                return true;
//            }
//        }
//        return false;
        return getIndex(list,id) >=0;
    }

    //获取索引
    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            String sid=stu.getId();
            if(sid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
