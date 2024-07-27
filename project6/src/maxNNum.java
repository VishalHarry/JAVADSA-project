public class maxNNum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,53,2,4567};
        int ans=max(arr);
        System.out.println(ans);
        int ans2=min(arr);
        System.out.println(ans2);
    }
    static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }

        return max;
    }
    static int min(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }

        return min;
    }
}
