public class Question8 {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,3};
        System.out.println(threesum(arr,12));
    }

    //target three sum
    static int threesum(int[] arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for( int k=j+1;k<arr.length;k++) {
                        if(arr[i]+arr[j]+arr[k]==target){
                            ans++;
                        }
                    }
                }}
        return ans;
    }
}
