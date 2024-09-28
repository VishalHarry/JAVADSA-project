public class Question11 {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,6,3,4};
        int ans=first(arr);
        System.out.println(ans);
    }
    //find the first pair of f=the array

    static int first(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                 return i;
                }
            }
        }

  return -1;
    }
}
