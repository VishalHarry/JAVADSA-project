public class Question7 {
    public static void main(String[] args) {
        int[] arr={4,6,3,5,8,2};
        System.out.println(pair(arr,7));
    }

    //target sum
    static int pair(int[] arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
