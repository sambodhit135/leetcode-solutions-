class Solution {
  
  Set<List<Integer>> set=new HashSet<>();
  
    public List<List<Integer>> permuteUnique(int[] nums) {
       boolean freq[]=new boolean[nums.length];
       ArrayList<Integer> list=new ArrayList<>();
       helper(nums,freq , list);
       List<List<Integer>> ans=new ArrayList<>(set);
       return ans;
    }

    public void helper(int nums[],boolean freq[],ArrayList list)
    {
        if(list.size()==nums.length)
        {
            set.add(new ArrayList<>(list));
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                list.add(nums[i]);
                freq[i]=true;
                helper(nums,freq, list);
                
                freq[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
    
}