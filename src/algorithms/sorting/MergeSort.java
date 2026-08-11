package algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        // Input array to be sorted
        int[] arr = {8, 3, 6, 1, 7, 2, 4, 5};

        // Start merge sort on the entire array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Recursively divides the array into smaller halves
     * until each subarray contains only one element.
     *
     * @param arr   Array to sort
     * @param left  Starting index of current subarray
     * @param right Ending index of current subarray
     */
    private static void mergeSort(int[] arr, int left, int right) {

        // Base case:
        // If the subarray contains only one element,
        // it is already sorted.
        if (left == right) {
            return;
        }

        // Find the middle index
        // Using this formula prevents integer overflow
        int mid = left + (right - left) / 2;

        // Recursively sort the left half
        mergeSort(arr, left, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, right);

        // Merge the two sorted halves
        merge(arr, left, right, mid);
    }

    /**
     * Merges two already sorted subarrays:
     * Left subarray  -> arr[left ... mid]
     * Right subarray -> arr[mid+1 ... right]
     *
     * @param arr   Original array
     * @param left  Start index of left subarray
     * @param right End index of right subarray
     * @param mid   Midpoint separating the two subarrays
     */
    private static void merge(int[] arr, int left, int right, int mid) {

        // Temporary array to store merged result
        int[] tempArr = new int[right - left + 1];

        // Pointer for left subarray
        int i = left;

        // Pointer for right subarray
        int j = mid + 1;

        // Pointer for temp array
        int tempIndex = 0;

        // Compare elements from both halves and
        // place the smaller one into tempArr
        while (i <= mid && j <= right) {

            if (arr[i] < arr[j]) {
                tempArr[tempIndex] = arr[i];
                tempIndex++;
                i++;
            } else {
                tempArr[tempIndex] = arr[j];
                tempIndex++;
                j++;
            }
        }

        // Copy any remaining elements from the left half
        while (i <= mid) {
            tempArr[tempIndex] = arr[i];
            tempIndex++;
            i++;
        }

        // Copy any remaining elements from the right half
        while (j <= right) {
            tempArr[tempIndex] = arr[j];
            tempIndex++;
            j++;
        }

        // Copy the merged sorted elements back
        // into the original array
        tempIndex = 0;
        for (int k = left; k <= right; k++) {
            arr[k] = tempArr[tempIndex++];
        }
    }
}