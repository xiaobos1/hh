public class fang {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        fangFa(arr);
    }
    public static void fangFa(int[] arr){
        int max=0;
        max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

}
