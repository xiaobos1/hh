public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,8,6,7,9};
        boolaem(arr,9);
    }
    public static void boolaem(int[] arr,int sz){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == sz){
                System.out.println("是");
            }
        }
        System.out.println("不是");
    }
}