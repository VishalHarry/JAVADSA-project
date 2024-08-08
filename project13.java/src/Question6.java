public class Question6 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};

        // Print the missing number
        System.out.println(findMissingPositiveNumber(arr));
    }
    //find the first Missing positive  Number//
    static int findMissingPositiveNumber(int[] arr) {
        int i = 0;
        // Perform cyclic sort
        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            // Check if the element is in the correct position and is within bounds
            if ( arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
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
                return j+1;
            }
        }

        // If no number is missing in the range [0, n-1], then the missing number is n
        return arr.length+1;
    }
}