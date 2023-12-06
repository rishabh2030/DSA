package binary_search;

import java.util.Arrays;

class firstAndLastIOccurance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2 };
        int [] ans = new int[2];
        ans[0] = first_occurrence(arr, 2);
        ans[1] = last_occurrence(arr, 2);
        System.out.println(Arrays.toString(ans));

    }

    public static int first_occurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int left_occurrence = -1;

        // left <= right
        // calculate the mid
        // if arr[mid] == target
        // left_occurrence = mid
        // right = mid - 1;
        // else if arr[mid] > target
        // right = mid - 1;
        // else
        // left = mid + 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                left_occurrence = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left_occurrence;
    }

    public static int last_occurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int last_occurrence = -1;

        // left <= right
        // calculate the mid
        // if arr[mid] == target
        // last_occurrence = mid
        // left = mid + 1;
        // else if arr[mid] > target
        // right = mid - 1;
        // else
        // left = mid + 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last_occurrence = mid;
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return last_occurrence;
    }
}
