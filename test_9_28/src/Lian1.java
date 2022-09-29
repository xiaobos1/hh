public class Lian1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
       int[] copyArr= copyOnew(arr,1,4);
        for(int i=0;i<copyArr.length;i++)
        {
            System.out.println(copyArr[i]);
        }

    }
    public static int[] copyOnew(int[] arr,int form,int to){
        int[] newArr=new int[to-form];
        int indix=0;
        for(int i=form;i<to;i++){
            indix++;
            newArr[indix]=arr[i];
        }
        return newArr;
    }
}
