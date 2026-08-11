class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        Set<Integer> set = new HashSet<>();

        int freq1[] = new int[1001];
        int freq2[] = new int[1001];
        for (int i = 0; i < n1; i++) {
            freq1[nums1[i]]++;
        }
        for (int i = 0; i < n2; i++) {
            freq2[nums2[i]]++;
        }

        for (int i = 0; i < n1; i++) {
            if (freq1[nums1[i]] > 0 && freq2[nums1[i]] > 0) {
                set.add(nums1[i]);
            }
        }
        int[] intersection = new int[set.size()];
        int i = 0;

        for (Integer num : set) {
            intersection[i] = num;
            i++;
        }

        return intersection;

    }
}