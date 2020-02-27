class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        char[] sol = s.toCharArray();
        for(int i=0; i<sol.length; i++)
        {
            if(sol[i] == 80 || sol[i] == 112)
            {
                p++;
            }
        }
        
        for(int i=0; i<sol.length; i++)
        {
            if(sol[i] == 89 || sol[i] == 121)
            {
                y++;
            }
        }
        
        if(p == y)
        {
            answer = true;
        }
        
        else
        {
            answer = false;
        }
        
        // char a = 65;
        // System.out.println(a);
        return answer;
    }
}