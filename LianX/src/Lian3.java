import java.util.Scanner;

public class Lian3 {
    public static void main(String[] args) {
        int b=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                b++;
            }
        }
        if(b==2)
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
