import java.util.*;

public class Question10 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
  int[] arr=new int[5];
  for(int i=0;i<arr.length;i++){
      arr[i]=in.nextInt();
  }

        System.out.println(second(arr));

    }
    //second largest element in array

    static int larg(int[] arr){
       int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        return max;
    }
    static int second(int[] arr){
        int mx=larg(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secondMax=larg(arr);
       return secondMax;
    }
}
