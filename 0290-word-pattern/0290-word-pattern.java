class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String ,Character> map1=new HashMap<>();
        Map<Character, String> map2=new HashMap<>();
        String str[]=s.trim().split("\\s+");
        if(pattern.length()!=str.length)
        {
            return false;
        }
       
       int i=0;
       int j=0;
       while(i<str.length && j<pattern.length())
        {
            if(map1.containsKey(str[i]))
            {
                if(map1.get(str[i])!=pattern.charAt(j))
                {
                    return false;
                }

            }
            if(map2.containsKey(pattern.charAt(j)))
            {
                if(!map2.get(pattern.charAt(j)).equals(str[i]))
                {
                    return false;
                }
            }

            if(!map1.containsKey(str[i]))
            {
                  map1.put(str[i],pattern.charAt(j));
                
            }

             if(!map2.containsKey(pattern.charAt(j)))
            {
                   map2.put(pattern.charAt(j),str[i]);
                   
            }
            i++;
            j++;
          
        }   
        if(i==pattern.length() && j==str.length)
        {
            return true;
        }
        return false;

    }
}