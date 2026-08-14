class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];

        int i = 0;
        int maxLength = 0;

        for (int j = 0; j < s.length(); j++) {

            int ch = s.charAt(j) - 'a';
            freq[ch]++;

            // Current character appeared more than twice
            while (freq[ch] > 2) {
                int leftChar = s.charAt(i) - 'a';
                freq[leftChar]--;
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }
}