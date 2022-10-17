package com.itheima.Test001;

public class Cook extends Empolyee{
    public Cook(){

    }
    public Cook(String id,String name,double salary){
        super(id,name,salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
