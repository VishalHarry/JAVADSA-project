public class Question9 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,4,3,1,2,5};
        System.out.println(unique(arr));

    }
    //find the unique number in the array
    static int unique(int[] arr){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
            for(int k=0;k<arr.length;k++){
                if(arr[k]>0){
                    ans=arr[k];
                }
            }
        }
       return ans;
    }
}
