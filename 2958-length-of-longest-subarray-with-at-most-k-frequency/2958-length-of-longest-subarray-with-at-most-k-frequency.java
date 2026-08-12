class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int maxcount=0;
        int count=0;
        while(j<nums.length)
        {
            count++;
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.get(nums[j])>max)
            {
                max=map.get(nums[j]);
            }
            while(max>k)
            {
                   map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                    i++;
                    max=map.get(nums[j]);
                    count--;
            }
            if(maxcount<count)
            {
                maxcount=count;
            }
            j++;
        }
        return maxcount;
    }
}