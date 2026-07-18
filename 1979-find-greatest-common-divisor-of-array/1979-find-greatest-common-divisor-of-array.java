class Solution {
    public int findGCD(int[] nums) {
       mergesort(nums,0,nums.length-1);

        return gcd(nums[0],nums[nums.length-1]);
    }

    public int gcd(int min, int max) {
        int mod = max % min;
        while (mod != 0) {
            max = min;
            min = mod;
            mod = max % min;
        }
        return min;
    }

    public void mergesort(int nums[], int low, int high) {
        if (low>=high) {
            return;
        }
        int mid = low + (high - low) / 2;

        mergesort(nums, low, mid);
        mergesort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public void merge(int nums[], int start, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                list.add(nums[i]);
                i++;
            } else {
                list.add(nums[j]);
                j++;
            }

        }
        while (i <= mid) {
            list.add(nums[i]);
            i++;
        }
        while (j <= high) {
            list.add(nums[j]);
            j++;
        }

        for( i=start;i<=high;i++)
        {
            nums[i]=list.get(i-start);
        }
    }

}