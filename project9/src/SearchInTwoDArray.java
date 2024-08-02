public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {6,7,8,9}
        };
        int target=9;
        System.out.println(search(arr,target));

    }
    static int search(int[][] arr,int target){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(target==arr[r][c]){
                    return r;
                }
            }
        }
        return -1;
    }
}
