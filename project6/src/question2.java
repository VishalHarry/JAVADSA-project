public class question2 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {3,2,1}

        };
        int ans=manWealth(arr);
        System.out.println(ans);

    }
    static int manWealth(int[][] arr){
        int max=Integer.MAX_VALUE;
        for(int p=0;p<arr.length;p++){
            int sum =0;
            for(int a=0;a<arr[p].length;a++){
                sum+=arr[p][a];

            }
            if(sum>max){
                max=sum;
            }

        }
        return max;
    }

}
