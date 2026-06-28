class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            int low=0;
            int high=mat[0].length-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(mat[i][mid]==1)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            map.put(i,low);
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