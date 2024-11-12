class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) 
    {
        int qLen=queries.length;
        int iLen=items.length;
        int answer[]=new int[qLen]; 

        Arrays.sort(items,(a,b)->Integer.compare(a[0],b[0]));

        for(int i=1;i<iLen;i++)
        {
            items[i][1]=Math.max(items[i-1][1],items[i][1]);
        }

        for(int i=0;i<qLen;i++)
        {
            int curr=queries[i];
            int l=0,h=iLen-1;
            int maxBeauty=0;

            while(l<=h)
            {
                int mid=l+(h-l)/2;

                if(items[mid][0]<=curr)
                {
                    maxBeauty=items[mid][1];
                    l=mid+1;
                }
                else
                    h=mid-1;
            }

            answer[i]=maxBeauty;

        }
        return answer;

    }
}