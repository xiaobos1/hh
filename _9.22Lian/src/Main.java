public class Main {
    public static void main(String[] args) {
        fan(ji(5.3,1.7),ji(2.4,2.7));
    }
    public static double ji(double a,double b)
    {
        double area=a*b;
        return  area;
    }

    public static void fan(double n,double m){
        if(n>m){
            System.out.println("第一个面积大");
            System.out.println(n);
        }else if(n==m){
            System.out.println("一样大");
        }else{
            System.out.println("第二个面积大");
        }
    }
}