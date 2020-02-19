class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";       
        int[] a = new int[participant.length];
        for(int i=0; i<participant.length; i++)
        {
            a[i] = 0;
        }
        
        for(int i=0; i<completion.length; i++)
        {   
            for(int j=0; j<participant.length; j++)
            {
                if(!participant[i].equals(completion[j]))
                {
                    a[i] = 1;
                    break;
                }
            }
        }
            
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==1)
            {
                answer = participant[i];
                break;
            }
        }
        return answer;
    }
}