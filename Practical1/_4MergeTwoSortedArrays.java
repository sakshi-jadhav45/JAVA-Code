import java.util.*;

public class _4MergeTwoSortedArrays {
    
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        
        // Merge both arrays in sorted order
        while (i < n1 && j < n2) {
            mergedArray[k++] = (arr1[i] < arr2[j]) ? arr1[i++] : arr2[j++];
        }
        
        // Copy remaining elements of arr1, if any
        while (i < n1) mergedArray[k++] = arr1[i++];
        
        // Copy remaining elements of arr2, if any
        while (j < n2) mergedArray[k++] = arr2[j++];
        
        return mergedArray;
    }
    
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 5, 8}; // Sorted
        int arr2[] = {10, 11, 12, 15, 16}; // Sorted
        
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        
        System.out.print("Merged Sorted Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
