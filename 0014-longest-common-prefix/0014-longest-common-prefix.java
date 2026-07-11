class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder common=new StringBuilder();
        String first=strs[0];
        
        for(int i=0;i<first.length();i++)
        {
            for(int j=1;j<strs.length;j++)
            {
                String check=strs[j];
                if(i>=check.length() || check.charAt(i)!=first.charAt(i))
                {
                    return common.toString();
                }
               
            }
             common.append(first.charAt(i));
        }
       return common.toString();

    }
}