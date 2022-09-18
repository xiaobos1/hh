import java.util.Scanner;

public class Good {
    public static void main(String[] args) {
        //键盘录入一个大于等于二的整数，并计算x的平方根保留整数部分
        //1-键盘录入
        Scanner de=new Scanner(System.in);
        int p=de.nextInt();
        for(int i=1;i<=p;i++){
            if(p>=i*i&&p<(i+1)*(i+1)){
                System.out.println(i);
                break;
            }
        }
    }
}
