class Solution {
    public boolean primeSubOperation(int[] nums) 
    {

        boolean sieve[]=new boolean[1000];
        Arrays.fill(sieve,true);

        sieve[0]=false;
        // sieve[1]=false;

        for(int i=2;i*i<1000;i++)
        {
            if(sieve[i])
            {
                for(int j=i*i;j<1000;j+=i)
                    sieve[j]=false;
            }     
        }


      for(int i=nums.length-2;i>=0;i--)
      {
        if(nums[i]<nums[i+1])
        {
            continue;
        }

        for(int p=2;p<nums[i];p++)
        {
            if(!sieve[p])
                {
                    continue;
                }

            if((nums[i]-p < nums[i+1]))
            {
                nums[i]-=p;
                break;
            }
        }

            if(nums[i] >= nums[i+1])
            {
                return false;
            }

        
      }
      return true;
    }
}