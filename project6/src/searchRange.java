public class searchRange {

    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7,8,9};
      int target=6;
      int start=arr[2];
      int end=arr[6];
      int ans=linearSearch(arr,target,start,end);
        System.out.println(ans);

    }
       static int linearSearch(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            int element =arr[i];
            if(element==target){
                return i;

            }
        }
        return 0;
    }
}
