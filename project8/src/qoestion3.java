public class qoestion3 {
    public static void main(String[] args) {
   char[] arr={'a','b','c','d'};
   char target='d';
   char ans=celing(arr,target);
        System.out.println(ans);
    }
    //find smallest latter graetest then tagert//

    static char celing(char[] arr, char target) {

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

             if(target<arr[mid]){
                end=mid-1;
            }
             else{
                start=mid+1;

            }
        }
        return arr[start % arr.length];
    }
}
