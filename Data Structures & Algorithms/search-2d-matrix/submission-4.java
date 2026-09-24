class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        while (i < matrix.length && j >= 0) {
            int pivot = matrix[i][j];
            if (target == pivot) {
                return true;
            } else if (target < pivot) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
