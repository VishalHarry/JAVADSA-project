public class Question5 {
    public static void main(String[] args) {
        int[] arr={8,9,2,8,6,8,5,8};
        System.out.println(count(arr,5));
    }
    ///strictly lower then the target
    static int count(int[] arr,int target){
     int count=0;
     for(int i=0;i<arr.length;i++){
         if(target<arr[i]){
             count++;
         }
     }
     return count;
    }
}
