class Solution {
    public int minimumPushes(String word) {
        int n = word.length();

        int ans = 0;
        int push = 1;
        int used = 0;

        for (int i = 0; i < n; i++) {
            ans += push;
            used++;

            if (used == 8) {
                push++;
                used = 0;
            }
        }

        return ans;
    }
}