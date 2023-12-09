package recursion;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        printSubset(new int[]{1, 2, 1}, 0, new ArrayList<>());
    }
    public static void printSubset(int arr[], int index, ArrayList<Integer> currentSubset) {

        if (index >= arr.length) {
            System.out.println(currentSubset);
            return;
        }
        printSubset(arr, index + 1, (ArrayList<Integer>) currentSubset.clone());
        currentSubset.add(arr[index]);
        printSubset(arr, index + 1, currentSubset);
    }
}
