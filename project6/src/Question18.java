import java.util.Arrays;

public class Question18 {
    public static void main(String[] args) {
          int[] arr={-10,-3,-2,1,4,5};

          int[] ans=sort(arr);
        System.out.println(Arrays.toString(ans));
          reverse(ans);
        System.out.println(Arrays.toString(ans));

    }
    //sqr the negative arrya in non decraesing order
    static void reverse(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

        }
    }
       static int[] sort(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int[] ans=new int[n];
        int k=0;
         while(i<=j){
             if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k]=arr[i]*arr[i];
                k++;
                i++;
             }
            else{
                ans[k]=arr[j]*arr[j];
                k++;
                j--;
            }
        }
        return ans;

    }
}
