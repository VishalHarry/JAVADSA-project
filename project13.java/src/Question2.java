import java.util.ArrayList;
import java.util.List;

class Question2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = findMissingNumbers(arr);
        System.out.println(missingNumbers);
    }

    // Find all missing numbers in the array
    static List<Integer> findMissingNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Find the correct index for arr[i]
            int correctIndex = arr[i] - 1;

            // Check if the current element is in the correct position
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                // Move to the next element if the current one is in the correct position
                i++;
            }
        }

        // Find all missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                missingNumbers.add(j + 1);
            }
        }

        return missingNumbers;
    }
}
