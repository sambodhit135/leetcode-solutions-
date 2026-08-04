class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       
        ArrayList<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
            min=nums[i];
            }
          if(nums[i]>max)
            {
                max=nums[i];
            }
        }
         
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        while(min<=max)
        {
            if(set.contains(min))
            {
                min++;
                continue;
            }
            list.add(min);
            min++;
        }
        return list;
         
    }
}