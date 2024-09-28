public class Question4 {
    public static void main(String[] args) {
        int[] arr={8,9,2,8,6,8,5,8};
        System.out.println(lastocc(arr,8));
    }
    //lastoccurence of the target
    static int lastocc(int[] arr, int target){
        int last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                last=i;
            }
        }
        return last;
    }
}

