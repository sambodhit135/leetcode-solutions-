class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split(" +");
        StringBuilder ans=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            String temp=arr[i];
            ans.append(temp);
            if(i>0)
            {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}