class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0)
        {
            return false;
        }
        StringBuilder str=new StringBuilder();
       while(n!=0)
       {
         
        str.append(n%2);
        n/=2;
       }
       int count=0;
       for(int i=0;i<str.length();i++)
       {
            if(str.charAt(i)=='1')
            {
                count++;
            }

       }

       if(count==1)
       {
        return true;
       }
       return false;
    }
}