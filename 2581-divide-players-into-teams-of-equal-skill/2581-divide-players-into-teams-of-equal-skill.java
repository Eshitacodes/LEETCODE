class Solution {
    public long dividePlayers(int[] skill) 
    {
     Arrays.sort(skill);

     int i=0,j=skill.length-1;

     int equal=skill[0]+skill[skill.length-1];

     long sum=0;

     while(i<skill.length/2)
     {
        if(skill[i]+skill[j]!=equal)
            return -1;
        sum+=skill[i]*skill[j];
        i++;
        j--;
     }
     
     return sum;

    }
}