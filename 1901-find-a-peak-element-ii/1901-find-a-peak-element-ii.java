class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean left = (j == 0) || (mat[i][j] > mat[i][j - 1]);
                boolean right = (j == n - 1) || (mat[i][j] > mat[i][j + 1]);
                boolean up = (i == 0) || (mat[i][j] > mat[i - 1][j]);
                boolean bottom = (i == m - 1) || (mat[i][j] > mat[i + 1][j]);

                if (up && bottom && left && right) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}