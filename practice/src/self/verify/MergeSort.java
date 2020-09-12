package self.verify;


import java.util.Random;


/**
 * �����������
 */
class Data{
    int length;
    int[] data;

    public Data(int length){
        this.length = length;
        data = new int[length];
    }

    public int[] getData(){

        Random random = new Random(System.currentTimeMillis());
        for(int i=0;i<length;i++){
            data[i]=random.nextInt(2*length);
        }
        return data;
    }
}

public class MergeSort {
	public static void main(String[] args) {
        int length = 1000;
        int[] data = (new Data(length)).getData();
        printArr(data);
        System.out.println();
        mergeSort(data);
        printArr(data);
    }

    //�ݹ�
    private static void mergeSort(int[] nums,int[] tmp,int left,int right){
        if(left<right){
            int center = (left+right)/2;
            mergeSort(nums,tmp,left,center);
            mergeSort(nums,tmp,center+1,right);
            merge(nums,tmp,left,center+1,right);
        }
    }

    //�ϲ�
    private static void merge(int[] nums,int[] tmp,int leftPos, int rightPos, int rightEnd){
        int leftEnd = rightPos-1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
    
        while(leftPos<=leftEnd&&rightPos<=rightEnd){
            if(nums[leftPos]<nums[rightPos])
                tmp[tmpPos++]=nums[leftPos++];
            else 
                tmp[tmpPos++]=nums[rightPos++];
        }
        while(leftPos<=leftEnd)
            tmp[tmpPos++]=nums[leftPos++];
        
        while(rightPos<=rightEnd)
            tmp[tmpPos++]=nums[rightPos++];
    
        for(int i = 0;i<numElements;i++,rightEnd--)
            nums[rightEnd]=tmp[rightEnd];
    }
    public static void mergeSort(int[] nums){
        int[] tmp = new int[nums.length];
        mergeSort(nums,tmp,0,nums.length-1);
    }
    
    //��ӡ
    public static void printArr(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
