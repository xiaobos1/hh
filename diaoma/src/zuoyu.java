public class zuoyu {
    public static void main(String[] args) {
        int x = 12345;
        int num=0;
        int c=x;
        while(x!=0){
            //求个位
            int g=x%10;
            //修改x的值
            x /=10;
            //拼接
            num=num*10+g;
        }
        System.out.println(num);
        System.out.println(num==c);
    }
}
