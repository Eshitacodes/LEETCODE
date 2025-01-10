class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) 
    {
        List<String> ans=new ArrayList<>();

        int i=0;
        int[] letterCount=new int[26],temp;
        // int[] letterCount2=new int[26];

        for(String w2:words2)
        {
            temp=count(w2);
            for(i=0;i<26;i++)
                letterCount[i]=Math.max(temp[i],letterCount[i]);
        }

        for(String w1:words1)
        {
            temp=count(w1);

            for(i=0;i<26;i++)
            {
                if(temp[i]<letterCount[i])
                    break;
            }

            if(i==26)
                ans.add(w1);
        }
        return ans;
    }

    int[] count(String word) 
    {
        int[] count = new int[26];
        for (char c : word.toCharArray()) count[c - 'a']++;
        return count;
    }
}