class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd = 1;
        int sumeven = 0;
        for (int i = 2; i <= n * 2; i++) {
            if (i % 2 == 0) {
                sumeven += i;
            } else {
                sumodd += i;
            }
        }

        int min = Math.min(sumodd, sumeven);
        int max = Math.max(sumodd, sumeven);

        int mod = max % min;
        while (mod != 0) {
            max=min;
            min=mod;
            mod = max % min;
        }
        return min;
    }
}