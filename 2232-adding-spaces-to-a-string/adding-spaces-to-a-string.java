class Solution {
    public String addSpaces(String s, int[] spaces) 
    {
     StringBuilder str=new StringBuilder();
     Arrays.sort(spaces);
    
     int k=0;

     for(int i=0;i<s.length();i++)
     {
        if(k<spaces.length && spaces[k]<s.length() && i==spaces[k])
        {
            str.append(" ");
            k++;
        }

        str.append(s.charAt(i));
        
     }

     return str.toString();   
    }
}