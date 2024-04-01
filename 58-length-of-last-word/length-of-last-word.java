class Solution {
    public int lengthOfLastWord(String s) 
    {
    //  s.trim();
     if(s.contains(" "))
     {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
     }
     else
     {
        return s.length();
     }
    }
}