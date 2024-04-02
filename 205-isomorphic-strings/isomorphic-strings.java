class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
     HashMap<Character,Character> map=new HashMap<>();
     int n1=s.length(),n2=t.length();
     Set <Character> set=new HashSet<Character>();
     if(n1!=n2)
        return false;
     for(int i=0;i<n1;i++)
     {
        if(map.containsKey(s.charAt(i)))
        {
            char ch=map.get(s.charAt(i));
            if(ch!=t.charAt(i))
                return false;
        }
        else
        {
            if(set.contains(t.charAt(i)))
                return false;
            map.put(s.charAt(i),t.charAt(i));
            set.add(t.charAt(i));
        }
     }  
     return true;
    }
}