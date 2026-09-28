class Solution {
    public int maxDepth(String s) {
        int maxcount =0;

        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            else if(s.charAt(i)==')')
            {
                if(count!=0)
                {
                    count--;
                }
            }

            maxcount=Math.max(maxcount,count);
        }
    return maxcount;
    }
}