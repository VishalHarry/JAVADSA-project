import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ans=rotate(arr,4);
        System.out.println(Arrays.toString(ans));

    }
    //rotate the array by the k th position

    static int[] rotate(int[] arr,int k){

        int n=arr.length;
        k=k % n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
}
