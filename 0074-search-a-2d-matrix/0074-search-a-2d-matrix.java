class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        if (arr[m - 1][n - 1] < target) {
            return false;
        }
        for (int i = 0; i < m; i++) {
            int low = 0;
            int high = n - 1;

            if (arr[i][low] > target) {
                return false;
            } else if (arr[i][high] < target) {
                continue;
            }

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[i][mid] == target) {
                    return true;
                } else if (target > arr[i][mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return false;
    }
}