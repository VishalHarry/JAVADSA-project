public class Question3 {
    public static void main(String[] args) {
        int[] arr={8,9,2,8,6,8,5,8};
        System.out.println(cunt(arr,8));
    }
  //count the occurence
    static int cunt(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
