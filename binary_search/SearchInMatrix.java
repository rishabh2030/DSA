package binary_search;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 11;

        System.out.println(binary_search_approuch(arr, target));
    }

    public static boolean FindTheIndex(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length;

        while (row < arr.length && col > 0) {
            if (arr[row][col] == target) {
                return true;
            }
            if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static boolean binary_search_approuch(int[][] arr, int target) {
        int size_row = arr.length;
        int size_col = arr[0].length;

        System.out.println(size_row);
        System.out.println(size_col);

        int start = 0;
        int end = size_row * size_col - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / size_row;
            int col = mid % size_col;

            if (arr[row][col] > target) {
                end = mid - 1;
            } else if (arr[row][col] < target) {
                start = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
