class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            map.put(i,count);
        }
        boolean arr[]=new boolean[mat.length];
        int ans[]=new int[k];
        int j=0;
        while(j<k)
        {
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=0;i<mat.length;i++)
            {
                if(min>map.get(i) && arr[i]==false)
                {
                    min=map.get(i);
                    idx=i;
                }
            }
            arr[idx]=true;
            ans[j]=idx;
            j++;
        }
        return ans; 
    }

}