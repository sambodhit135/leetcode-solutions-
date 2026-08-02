class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> temp=new ArrayList<>();
     
        helper(nums,0 , temp);
        return list;
    }
    public void helper(int nums[],int i,ArrayList<Integer> temp)
    {
        if(i==nums.length)
        {
          list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        helper(nums,i+1,temp);
        temp.remove(temp.size()-1);
        helper(nums,i+1,temp);
    }
}