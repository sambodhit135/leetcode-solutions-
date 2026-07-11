class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
          int ST[]=new int[256];
          int TS[]=new int[256];

          for(int i=0;i<s.length();i++)
          {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(ST[ch1]==0 && TS[ch2]==0)
            {
                ST[ch1]=ch2;
                TS[ch2]=ch1;
            }
            else if(ST[ch1]!=ch2 || TS[ch2]!=ch1)
            {
                return false;
            }
          }
          return true;
    }
}