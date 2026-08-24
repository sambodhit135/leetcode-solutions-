class Solution {
    public int hammingWeight(int n) {
        int count=0;
        StringBuilder str=new StringBuilder();
        while(n!=0)
        {
            str.append(n%2);
            n/=2;
        }

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }
        }

        return count;
    }
}