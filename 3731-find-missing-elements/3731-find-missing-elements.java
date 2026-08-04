class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
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
        int i=0;
       while(i<nums.length)
        {
            if(nums[i]==min)
            {
               
                i++;
                
            }
            else if(nums[i]!=min)
            {
                 list.add(min);
                
                
            }
            min++;
           
        }

        while(min<=max)
        {
            list.add(min);
            min++;
        }
        return list;
         
    }
}