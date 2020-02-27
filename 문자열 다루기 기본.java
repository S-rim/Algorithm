class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] sol = s.toCharArray();
        System.out.println(sol);
  
            for(int i=0; i<sol.length; i++)
            {
                if(sol[i] > 64 && sol[i] < 123)
                {
                    answer = false;
                    break;
                }
                else if(sol[i]<58 && sol[i]>47)
                {
                    answer = true;
                }
            }
        if(sol.length !=4 && sol.length !=6)
        {
            answer = false;
        }
        return answer;
    }
  }