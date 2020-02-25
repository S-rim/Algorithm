class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int a = 0;
        for(int i=0; i<arr.length; i++)
        {
            answer = answer + arr[i];
            a = i+1;
        }
        
        answer = answer/a;
        return answer;
    }
  }