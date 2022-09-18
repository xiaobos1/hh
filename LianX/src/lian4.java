import java.util.Random;
import java.util.Scanner;

public class lian4 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        Random c=new Random();
        int num=0;
        do{
            System.out.println("玩输入1：");
            System.out.println("不玩输入2：");
            int a=d.nextInt();


            switch(a){
                case 1:
                    continue;
                case 2:
                    System.out.println("退出游戏");
                    break;
                default:
                    System.out.println("错误指令");
            }
        }while( true);
    }
}
