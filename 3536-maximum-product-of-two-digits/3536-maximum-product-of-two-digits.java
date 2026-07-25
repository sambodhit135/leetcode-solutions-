class Solution {
    public int maxProduct(int n) {
        int max = 0;
        while (n != 0) {

            int sample = n / 10;
            while (sample != 0)
            {
            int ans = n % 10;
            ans = ans * (sample % 10);
            
            if (ans > max) {
                max = ans;
            }
            sample /= 10;
            }
             n /= 10;
        }
        return max;
    }
}