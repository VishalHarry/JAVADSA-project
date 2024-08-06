import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arr={2,1,4,2,6,5};
        int[] ans=findErrorNUm(arr);
        System.out.println(Arrays.toString(ans));

    }

    //find the missing and duplicate element in the given array//
    static int[] findErrorNUm(int[] arr){
        int i = 0;
        // Perform cyclic sort
        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            // Check if the element is in the correct position and is within bounds
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                // Move to the next element if the current one is in the correct position
                i++;
            }
        }

        // Search for the missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return new int[] {arr[j],j+1};
            }
        }
       return new int[] {-1,-1};
    }

}
