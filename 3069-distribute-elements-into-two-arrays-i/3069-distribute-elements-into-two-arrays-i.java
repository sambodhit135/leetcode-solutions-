class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        int k=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(k<1)
            {
                arr1[k++]=nums[i];
            }
            else if(j<1)
            {
                arr2[j++]=nums[i];
            }
            else if(arr1[k-1]>arr2[j-1])
            {
                arr1[k++]=nums[i];
            }
            else 
            {
                arr2[j++]=nums[i];
            }
        }

        for(int i=0;i<j;i++)
        {
            arr1[k++]=arr2[i];
        }

        return arr1;
    }
}