package com.xiaobo.lian;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {

        String str="Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，"+
                "因为这俩个是长期版本，下一个长期支持版本是Java17，相信在不就得将来Java17也将登上历史舞台";
       // Pattern pt = Pattern.compile("Java\\d{0,2}");
//

        String regex="((?i)java)(?!:17|11|8)";

        Pattern p=Pattern.compile(regex);

        Matcher m=p.matcher(str);

        while(m.find()){
            System.out.println(m.group());
        }
        //拿着文本匹配器从头匹配到底，寻找符合要求的子串
        //boolean flag=m.find();

//        String s = m.group();
//        System.out.println(s);
    } //获取文本匹配器
//        Matcher m=pt.matcher(str);
//
//        while(m.find()){
//            String s = m.group();
//            System.out.println(s);
//        }
}
