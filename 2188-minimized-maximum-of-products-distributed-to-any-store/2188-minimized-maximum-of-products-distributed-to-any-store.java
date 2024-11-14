class Solution {
    public int minimizedMaximum(int n, int[] quantities) 
    {
        int m=quantities.length;
       int left=1;
       int right=Integer.MIN_VALUE;

       for(int i:quantities)
            right=Math.max(i,right);

        int result=0;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(possibleToDivide(mid,quantities,n))
                {
                    result=mid;
                    right=mid-1;
                }

            else
                left=mid+1;
        }

        return result;


    }

    boolean possibleToDivide(int prodPerShop, int[] quantities,int store)
    {
        for(int proQuant:quantities)
        {
            // store-=(proQuant+ prodPerShop-1)/prodPerShop;
            store-=Math.ceil((double)proQuant/prodPerShop);

            if(store<0)
                return false;
        }
        return true;
    }
}