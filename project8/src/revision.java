public class revision {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 17;

        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start);
            boolean isAsk;
            if(arr[start]<arr[end]){
                isAsk=true;

            }
            else{
                isAsk=false;
            }

            if(arr[mid]==target){
               return mid;
            }
            if(isAsk){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
            }
        }
        return end;
    }
}

