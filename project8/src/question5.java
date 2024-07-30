public class question5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=6;
        int ans1=ans(arr,target);
        System.out.println(ans1);

    }
    static int ans(int[] arr ,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int news=end+1;
            end=end+(end-start+1)*2;
            start=news;

        }
        return search(arr,target,start,end);

    }
    static int search(int[] arr, int target,int start,int end){
         start =0;
         end=arr.length-1;
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
        return -1;
    }
}
