class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        int sign = 1;
        int i = 0;
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        long ans = sign * IntegertoString(i, 0, s);
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) ans;
    }

    private long IntegertoString(int i, long num, String s) {
        if (i >= s.length() || s.charAt(i) < '0' || s.charAt(i) > '9') {
            return num;
        }

        
        int digit = s.charAt(i) - '0';

        if (num > Long.MAX_VALUE / 10 ||
                (num == Long.MAX_VALUE / 10 && digit > Long.MAX_VALUE % 10)) {
            return Long.MAX_VALUE;
        }

        num = num * 10 + digit;
        return IntegertoString(i + 1, num, s);
    }
}