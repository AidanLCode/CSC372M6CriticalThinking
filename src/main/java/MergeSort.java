import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort {
    public static void mergeSort(ArrayList<Student> list, Comparator<Student> comparator) {
        if (list.size() <= 1) {
            return; // This is the base case just in case the list contains one or fewer students.
        }

        // Initial halving of the list:
        int middle = list.size() / 2;

        // Partition the list into a left and right sublist:
                // Left partition is from index 0 to the middle of the list:
        ArrayList<Student> left = new ArrayList<Student>(list.subList(0, middle));
                // Right partition is from the middle to the size of the list:
        ArrayList<Student> right = new ArrayList<Student>(list.subList(middle, list.size()));

        // Recursively sort the left and right halves of the list
        mergeSort(left, comparator);
        mergeSort(right, comparator);

        // Merge the sorted students using our merge method
        merge(list, left, right, comparator);

    }

    private static void merge(ArrayList<Student> list, ArrayList<Student> left, ArrayList<Student> right, Comparator<Student> comparator) {
        int leftIndex = 0; // Keeps track of the current index of the left sub array that is being merged.
        int rightIndex = 0; // Keeps track of the current index of the right sub array that is being merged.
        int mergeIndex = 0; // Keeps track fo the current index in the merged array.

        // Merge the left and right Arrays
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (comparator.compare(left.get(leftIndex), right.get(rightIndex)) <=0) {
                list.set(mergeIndex++, left.get(leftIndex++));

            } else {
                list.set(mergeIndex++, right.get(rightIndex++));
            }
        }
        // Copy the remaining elements of the left if there are any.
        while (leftIndex < left.size()) {
            list.set(mergeIndex++, left.get(leftIndex++));
        }

        // Copy the remaining elements of the right if there are any.
        while (rightIndex < right.size()) {
            list.set(mergeIndex++, right.get(rightIndex++));
        }
    }
}
