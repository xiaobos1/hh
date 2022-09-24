import java.util.Scanner;

public class LianCi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        ch = input.next().charAt(0);
        int i = 0;
        int n = 3;
        for (i = 0; i < n; i++) {
            int j = 0;
            for (j = 0; j < n+i; j++) {
                if (j >= n - i - 1) {
                    System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (i = 0; i < n - 1; i++)
        {
            int j=0;
            for(j=0;j<=n-i;j++)
            {
                if(j>=i+1){
                    System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
