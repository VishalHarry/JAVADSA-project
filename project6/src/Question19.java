import java.util.Arrays;

public class Question19 {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5};
        int[] ans= presum(arr);
        System.out.println(Arrays.toString(ans));
    }
    //running sum/prefix sum

    static int[] presum(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
}
