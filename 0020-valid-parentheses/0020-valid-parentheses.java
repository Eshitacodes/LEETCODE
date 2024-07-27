class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stack=new Stack<Character>();

        int i=0;
        int valid=1;
        while(i<s.length())
        {
            
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));

            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
            {
                if(stack.isEmpty())
                   {
                    valid=0;
                   break;
                   }

                if(s.charAt(i)==')' && stack.pop() !='(')
                    valid=0;

                if(s.charAt(i)=='}' && stack.pop() !='{')
                    valid=0;

                if(s.charAt(i)==']' && stack.pop() !='[')
                    valid=0;
            }
            i++;

        }
        
        if(!stack.isEmpty())
            return false;
        if(valid==1)
            return true;

        return false;
    }
}