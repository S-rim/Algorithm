class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int num = 0;
        char[] sol = s.toCharArray();
          for (int i = 0; i < s.length(); i++) 
          {
              if (s.charAt(i) >= 65 && s.charAt(i) <= 90) 
              {
                  if (s.charAt(i) + n > 90) {
                      answer += (char) (s.charAt(i) + n - 26);
                  } else {
                      answer += (char) (s.charAt(i) + n);
                  }
              }
              if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                  if (s.charAt(i) + n > 122) {
                      answer += (char) (s.charAt(i) + n - 26);
                  } else {
                      answer += (char) (s.charAt(i) + n);
                  }
              }
              if (s.charAt(i) == 32) 
              {
                  answer += " ";
              }
          }
        return answer;
      }
  }