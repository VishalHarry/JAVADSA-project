public class Question1 {
    public static void main(String[] args) {
       int[] arr={2,3,5,9,14,16,18};
       int target=17;
       int ans=celing(arr,target);
        System.out.println(ans);


    }
    //find the celing of the target in given arr//celing=(smaller no <=target)(which is alawys start position number)

    static int celing(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target>arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
             else if(target>arr[mid]){
                 start=mid+1;

            }
        }
        return start;
    }

}
