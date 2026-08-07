class Solution {
    HashMap<Character, String> map=new HashMap<>();
    List<String> list=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder str=new StringBuilder();
        helper(0,digits,str);
        return list;
    }

    public  void helper(int i, String digit, StringBuilder str)
    {
        if(str.length()==digit.length())
        {
            list.add(str.toString());
            return ;
        }

        String letters=map.get(digit.charAt(i));
        for(int j=0;j<letters.length();j++)
        {
            str.append(letters.charAt(j));
            helper(i+1,digit,str);
            str.deleteCharAt(str.length()-1);
        }
    }
}