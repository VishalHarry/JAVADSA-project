public class question2 {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=17;
        int ans=floor(arr,target);
        System.out.println(ans);

    }
//find the floor in the given array//(floor=greater no <=target)(which is always end position number)
    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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
        return end;
    }
}
