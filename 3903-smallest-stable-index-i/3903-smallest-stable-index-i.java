class Solution {
    public int firstStableIndex(int[] nums, int k) {
       
        int maxti[]= new int[nums.length];
        int minti[]=new int  [nums.length];
       
        int max=nums[0];
         maxti[0]=max;
        for(int i=1;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
            maxti[i]=max;
        }
        int min=nums[nums.length-1];
         minti[nums.length-1]=min;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
            minti[i]=min;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(maxti[i]-minti[i]<=k)
            {
                return i;
            }
        }
        return -1;
    }
}