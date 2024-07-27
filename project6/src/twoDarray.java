import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int[][] arr={
                {1,34,5,6,},
                {4,5,6,7,8},
                {6,7,87,5,4}
        };
        int target=87;
      int[] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }
}
