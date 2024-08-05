public class Question3 {
    public static void main(String[] args) {
        int[] arr={3,2,1,2,4};
        System.out.println(cyclicSort(arr));

    }
    //find duplicate numbers
    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i]!=i+1){
                // Find the correct index for arr[i]
                int correctIndex = arr[i] - 1;

                // Check if the current element is in the correct position
                if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                    // Swap the elements
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                 } else {

                   return arr[i];

                 }

            }else{
                // Move to the next element if the current one is in the correct position
                i++;
            }

        }
        return -1;

    }
}
