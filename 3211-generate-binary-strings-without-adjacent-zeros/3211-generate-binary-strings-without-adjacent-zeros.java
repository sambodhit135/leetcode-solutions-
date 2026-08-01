class Solution {
    List<String> list=new ArrayList<>();
    public List<String> validStrings(int n) {
        
         helper( n, new StringBuilder());
         return list;
    }
    public void helper( int n, StringBuilder str)
    {
        if(str.length()==n)
        {
            list.add(str.toString());
             return ;
        }
        str.append('1');
        helper(n,str);
        str.deleteCharAt(str.length()-1);
        if(str.isEmpty()|| str.charAt(str.length()-1)!='0')
        {
            str.append('0');
        helper(n,str);
        str.deleteCharAt(str.length()-1);
        }

    }
}