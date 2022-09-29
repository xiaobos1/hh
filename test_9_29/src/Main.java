public class Main {
    public static void main(String[] args) {
        int count=0;
        for(int i=101;i<=200;i++){
            boolean t=true;
           for(int j=2;j<i;j++){
               if(i%j==0){
                    t=false;
                    break;
               }
           }
           if(t) {
               System.out.println("质数" + i);
               count++;
           }
//           }else{
//               System.out.println("不是");
//           }
        }
    }
}