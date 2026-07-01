class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = m - 1;
        while (low <= high)
        {
            int mid=low+(high-low)/2;
            int max=-1;
            int idx=-1;
            for(int i=0;i<n;i++)
            {
                if(mat[mid][i]>max)
                {
                    max=mat[mid][i];
                    idx=i;
                }
            }
            
            boolean up=mid==0||(max>mat[mid-1][idx]);
            boolean down=mid==m-1 || (max>mat[mid+1][idx]);

            if(up && down)
            {
                return new int[]{mid,idx};
            }
            else if(!up)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }            
        }           
           
        return new int[] { -1, -1 };
    }
}