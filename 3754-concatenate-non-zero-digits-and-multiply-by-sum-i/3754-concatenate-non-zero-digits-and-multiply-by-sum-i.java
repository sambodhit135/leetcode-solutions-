class Solution {
    public long sumAndMultiply(int n) {
        int ans = 0;
        int sum = 0;
        int sample = n;
         
        while (sample != 0) {
            int rem=sample%10;
            if(rem!=0)
            {
                ans=ans*10+(sample%10);;
                sum+=rem;
            }
            sample/=10;
        }
        sample=ans;
        ans=0;
        while(sample!=0)
        {
             int rem=sample%10;
            
                ans=ans*10+(sample%10);;
                
             
            sample/=10;

        }
        return (long)ans*sum;
    }
}