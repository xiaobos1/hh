package com.xiaobo.lian;

public class Test003 {
    public static void main(String[] args) {
        int[] arr={7,9,13,19,16,20,27,22,30,40,36,43,50,44};

        Block b1=new Block(9,0,1);
        Block b2=new Block(30,2,8);
        Block b4=new Block(50,9,13);

        Block[] block={b1,b2,b4};
        int number=30;
        //获取索引
        int ret=Number(block,arr,number);

        System.out.println(ret);

    }
    public static int Number(Block[] block,int[] arr,int num) {
        int index=BlockIndex(block,num);
        if(index==-1){
            return -1;
        }
        int beginIndex=block[index].getLeftIndex();
        int endIndex=block[index].getEndIndex();
        for (int i = beginIndex; i <=endIndex; i++) {
            if(arr[i]==num){
                return i;
            }
        }
       return -1;
    }
    public static int BlockIndex(Block[] block,int num){
        for (int i = 0; i < block.length; i++) {
            if(num<=block[i].getMax()){
                return i;
            }
        }
        return -1;
    }


}


class Block{
    private int max;
    private int leftIndex;
    private int endIndex;

    public Block(){}

    public Block(int max,int leftIndex,int endIndex){
        this.max=max;
        this.leftIndex=leftIndex;
        this.endIndex=endIndex;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setLeftIndex(int leftIndex) {
        this.leftIndex = leftIndex;
    }

    public int getLeftIndex() {
        return leftIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}