import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort  {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] arr={5,4,3,2,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getmaxIndex(arr,0,last);

            swap(arr,maxIndex,last);

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp;
        temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getmaxIndex(int[] arr,int start,int last){
        int max=start;
        for(int i=start;i<+last;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }

}
