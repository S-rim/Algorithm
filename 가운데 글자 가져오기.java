class Solution {
    public String solution(String s) {
        String answer = "";
        int a = 0;
        a = s.length();
        if(a%2==1)
        {
            a = a/2;
            answer = s.substring(a,a+1);          
        }
        else
        {
          a = a/2;
          answer = s.substring(a-1,a+1);
        }
        return answer;
    }
  }