class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length;
        int n=arr[0].length;

        int low=0;
        int high=n*m-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            int row=mid/n;
            int col=mid%n;

            if(arr[row][col]==target)
            {
                return true;
            }
            else if(arr[row][col]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
}