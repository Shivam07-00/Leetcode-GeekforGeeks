class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int i=0;
        int j = row*col-1;

        while(i<=j){
            int mid = (i+j)/2;

            row = mid/matrix[0].length;
            col = mid%matrix[0].length;

            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                j=mid-1;
            }
            else if(matrix[row][col]<target){
                i=mid+1;
            }

        }
    return false;
    }
}