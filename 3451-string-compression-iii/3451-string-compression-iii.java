class Solution {
    public String compressedString(String word) 
    {
     StringBuilder comp=new StringBuilder("");
     int arr[]=new int[26];
     int count=1;
     int i;

     for(i=0;i<word.length()-1;i++)
     {
        if(word.charAt(i)==word.charAt(i+1))
            count++;

        else
        {
            while(count>0)
            {
                if(count<10)
                    // comp=comp+ count +word.charAt(i);
                    comp.append(count).append(word.charAt(i));
            
                else
                {
                    // comp=comp+9+word.charAt(i);
                    comp.append(9).append(word.charAt(i));
                }

                count-=9;
            }

            count=1;
        }
     }

     while(count>0)
            {
                if(count<10)
                    comp.append(count).append(word.charAt(i));
                    // comp=comp+ count +word.charAt(i);
            
                else
                {
                    // comp=comp+9+word.charAt(i);
                    comp.append(9).append(word.charAt(i));
                }

                count-=9;
            }

    //  comp=comp+ count+word.charAt(i);

     return comp.toString();

    }
}