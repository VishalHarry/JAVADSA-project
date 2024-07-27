public class Agnostic {

        public static void main(String[] args) {
            int[] arr={1,2,3,4,5,6,7,8,9,10};
            int target=9;
            int anns=orderAgnostic(arr,target);
            System.out.println(anns);

        }
        static int orderAgnostic(int[] arr,int target){
            int start=0;
            int end=arr.length-1;
            boolean isAs;
            if(arr[start]<arr[end]){
                isAs=true;

            }
            else{
                isAs=false;
            }

            while(start<=end){
                int mid =start+(end-start)/2;
                if(target==mid){
                    return mid;
                }
                if(isAs){
                    if(target<arr[mid]){
                        end=mid-1;
                    }
                    else if(target>arr[mid]){
                        start=mid+1;
                    }
                }else{
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


