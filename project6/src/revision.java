import java.util.Arrays;

class revision{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        int[] ans=persum(arr);
        System.out.println(Arrays.toString(arr));


    }
    static int[] persum(int[] arr){

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];

        }
        return arr;
    }

    }

