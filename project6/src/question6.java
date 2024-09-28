public class question6 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,6,7};
        System.out.println(check(arr));
    }
    //arr is sorted or noot
    static boolean check(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;

            }
        }
        return true;
    }
}
