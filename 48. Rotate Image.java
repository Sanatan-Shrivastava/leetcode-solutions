class Solution {
    public void rotate(int[][] matrix) {
        // ...error checking
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        // transposing the matrix;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        // reversing the matrix;

        for (int i = 0; i < matrix.length; i++) {
            // size of the row of matrix;
            int l = 0;

            // size of the column of the matrix;
            int r = matrix[i].length - 1;

            // ...current row of the matrix;
            int[] row = matrix[i];

            // ...swapping the number in the row -> reversing;
            while (l < r) {
                int t = row[l];
                row[l] = row[r];
                row[r] = t;
                l++;
                r--;
            }
        }

        return;
    }
}