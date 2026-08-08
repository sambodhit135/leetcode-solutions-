class Solution {
  
  List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
       boolean freq[]=new boolean[nums.length];
       ArrayList<Integer> list=new ArrayList<>();
       helper(nums,freq , list);
       return ans;
    }

    public void helper(int nums[],boolean freq[],ArrayList list)
    {
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList<>(list));
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