class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
             
              if(check(nums[i],i))
            {
                return i;
            }
        }
        return -1;
    }


    public boolean check(int el, int target)
    {
        int sum=0;
        while(el>0)
        {
            sum+=el%10;
            if(sum>target)
            {
                return false;
            }
            el/=10;
        }
        if(sum==target)
        {
            return true;
        }
        return false;
    }
}