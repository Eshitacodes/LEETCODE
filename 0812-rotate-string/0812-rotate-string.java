class Solution {
    public boolean rotateString(String s, String goal) 
    {
        int gLen=goal.length();
        int sLen=s.length();
        if(sLen!=gLen)
            return false;

        char first=goal.charAt(0); 
        int k=s.indexOf(first);

        while(k!=-1)
        {
            if((s.substring(k,sLen)+s.substring(0,k)).equals(goal))
            
                return true;

            k=s.indexOf(first,k+1);
        }

        return false;
    }
}