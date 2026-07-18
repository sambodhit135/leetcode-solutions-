class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        return gcd(nums[0],nums[nums.length-1]);
    }
    public int gcd(int min, int max)
    {
        int mod=max%min;
        while(mod!=0)
        {
            max=min;
            min=mod;
            mod=max%min;
        }
        return min;
    }
}