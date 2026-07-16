class Solution {
    public long gcdSum(int[] nums) {
        long sum=0;
        int n=nums.length;
        int prefixgcd[]=new int[n];
        int max=nums[0];
        prefixgcd[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }

            prefixgcd[i]=gcd(nums[i],max);
        }

        Arrays.sort(prefixgcd);
        int i=0;
        int j=n-1;
        while(i<j)
        {
            sum+=gcd(prefixgcd[i],prefixgcd[j]);
            i++;
            j--;
        }
        return sum;
    }

    private int gcd(int min, int max) {

        int mod = max % min;
        while (mod != 0) {
            max = min;
            min = mod;
            mod = max % min;
        }
        return min;
    }
}