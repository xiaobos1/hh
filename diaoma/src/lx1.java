import java.util.Scanner;

public class lx1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int i=0;
        int x=1;
        int y=0;
        int n=input.nextInt();
        for(i=1;i<=n;i++){
            x=x*i;
            y=y+x;
        }
        System.out.println("阶乘"+y);
    }
}
