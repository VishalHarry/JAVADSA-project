import java.util.Arrays;

public class Question15 {
    public static void main(String[] args) {
   int[] arr={1,2,3,4,5};
   rotate(arr,4);
        System.out.println(Arrays.toString(arr));
    }
    //rotate the array by the k th position

    static void reverse(int[] arr,int i,int j){

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
}
