class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> finallist=new ArrayList<>();
        int row=grid.length;
        int col=grid[0].length;
        int total=row*col;
        k=k%total;

        reverse(0,total-k-1,grid);
        reverse(total-k,total-1,grid);
        reverse(0,total-1,grid);
        for(int i=0;i<row;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<col;j++)
            {
                list.add(grid[i][j]);
            }
            finallist.add(list);
        }
        return finallist;

    }
    public void reverse(int start,int end,int grid[][])
    {
        int col=grid[0].length;
        while(start<=end)
        {
            
            int temp=grid[start/col][start%col];
            grid[start/col][start%col]=grid[end/col][end%col];
            grid[end/col][end%col]=temp;
            start++;
            end--;
        }
    }
}