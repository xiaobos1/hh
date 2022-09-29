import java.util.Random;

public class Lian {
    public static void main(String[] args) {


        //大写字母和小写字母放到数组中
        char[] arr=new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i<=25){
                //添加小写字母
                arr[i]=(char)(97+i);
            }else {
                //添加大写字母
                arr[i] = (char) (65 + i - 26);
            }
        }
        //定义一个字符串将随机值连起来
        String result="";
        //随机抽取四次
        Random a=new Random();
        for (int i = 0; i < 4; i++) {
            //随机元素
            int index=a.nextInt(arr.length);
            result=result+arr[index];
        }
        //随机获得0~9的数字
        int number=a.nextInt(10);

        result=result+number;
        //打印结果
        System.out.println(result);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
