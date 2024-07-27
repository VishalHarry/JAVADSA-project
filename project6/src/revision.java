import java.util.Arrays;

class revision{
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5},
                {5,6,7,8},
                {12,23,34,45}

        };
        int target=45;
        int[] ans= search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}