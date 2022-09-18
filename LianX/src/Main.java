import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=0;
        int b=0;
        Scanner cr=new Scanner(System.in);
        int sc=cr.nextInt();
        int cs=sc;
        while (sc !=0){
            i=sc%10;
            sc=sc/10;
            b=b*10+i;
        }
        System.out.println(b);
        System.out.println(cs);
        if(b==cs){
            System.out.println("true");
        }else{
            System.out.println("flase");
        }

    }
}