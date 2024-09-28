import java.util.Arrays;

public class Question17 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
  //move  all the even number in the first of the array
    static void sort(int[] arr){
        int i=0;int j=arr.length-1;
        while(i<j){
            if(arr[i]%2==1&&arr[j]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2==1){
                j--;
            }
        }
    }
}
