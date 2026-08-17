class Solution {
    public boolean isHappy(int n) {
         
        int i=0;
        HashSet<Integer> set=new HashSet<>();
        while(true)
        {
            int sum=0;
            while(n!=0)
            {
                sum+=(int)Math.pow(n%10,2);
                n/=10;
            }
            if(sum==1)
            {
                return true;
            }

            if(set.contains(sum))
            {
                break;
            }
            set.add(sum);
            n=sum;
        }
         return false;

    }
}
   