import java.util.Arrays;

public class Cyclic {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1}; // Example array
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
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
    }
}
