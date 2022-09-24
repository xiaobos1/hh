import java.util.Scanner;

public class Gkk {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int g=s%10;
        int sh=(s/10)%10;
        int b=(s/100)%10;
        System.out.println("个:"+g);
        System.out.println("十:"+sh);
        System.out.println("百:"+b);

    }
}
