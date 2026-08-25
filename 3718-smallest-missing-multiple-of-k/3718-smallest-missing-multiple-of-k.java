class Solution {
    public int missingMultiple(int[] nums, int k) {
        int freq[]=new int[101];

        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        int i=2;
        int n=k;
        while(n<101 &&freq[n]!=0)
        {
            n=k*i;
            i++;
        }
        return n;
    }
}