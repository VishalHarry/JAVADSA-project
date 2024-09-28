import java.util.Arrays;

public class Question16 {
    public static void main(String[] args) {
  int[] arr={1,1,1,0,0,1,0,1,0,1,0,1};

//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//        sort2(arr);
//        System.out.println(Arrays.toString(arr));
        sort3(arr);
        System.out.println(Arrays.toString(arr));


    }
    //sort the array containing 0 and 1

    static int count(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }

    static void sort(int[] arr){
         int count=count(arr);
         for(int i=0;i<count;i++){
             arr[i]=0;
         }
         for(int i=count;i<arr.length;i++){
             arr[i]=1;
         }

    }
    static void sort2(int[] arr){

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
    }

    static void sort3(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1 &&arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }

    }
}
