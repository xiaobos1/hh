package com.String1;

public class String1 {
    public static void main(String[] args) {
        String str=red("abc");
        System.out.println(str);
    }

    public static String red(String s)
    {
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            char a=s.charAt(i);
            str +=a;
        }
        return str;
    }

}
