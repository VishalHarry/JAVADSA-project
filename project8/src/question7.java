public class question7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,2};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);

        
    }
     static int search(int[] arr,int target){
        int peak= peakElement(arr);
        int firstTry=binarySearch(arr,target,0,peak);
        if(firstTry!=-1)
        {
           return firstTry;
        }
        return binarySearch(arr,target,peak+1,arr.length-1);

    }
    static  int peakElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;

    }
    static int ans(int[] arr ,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int news=end+1;
            end=end+(end-start+1)*2;
            start=news;

        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr, int target,int start,int end){
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
