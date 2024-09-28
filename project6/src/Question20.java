import java.util.*;


public class Question20  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = in.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter the array elements");
        for (int i = 1; i <=n; i++) {  // Corrected the loop to start from 0 and go till n-1
            arr[i] = in.nextInt();
        }
         presum(arr);
        System.out.println(Arrays.toString(arr));
        quarry(arr,3);



    }
    //running sum/prefix sum

    static int[] presum(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    static void quarry(int[] arr,int q){
        int[] persum=presum(arr);
        Scanner sc = new Scanner(System.in);
        while(q-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=persum[r]+persum[l-1];
            System.out.print("the ans is:" + ans);
        }

    }

}
