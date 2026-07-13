class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        String str="123456789";

        List<Integer> ans=new ArrayList<>();

        int lowlength=String.valueOf(low).length();
        int highlength=String.valueOf(high).length();

        for(int len=lowlength;len<=highlength;len++)
        {
            for(int start=0;start+len<=9;start++)
            {
                int num=Integer.parseInt(str.substring(start,start+len));
                if(num>=low && num<=high)
                {
                    ans.add(num);
                }
            }
        }
        return ans;
    }
    
}