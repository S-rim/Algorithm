import java.util.*;

class Solution{
	public static int[] solution(int[] array) {
	       
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        
        for(int i = 0; i < array.length-1; i++) 
        {
           if(array[i] != array[i+1]) 
           {
              newArr.add(array[i]);
           }
        }
        
        newArr.add(array[array.length-1]);
        
        int[] answer = new int[newArr.size()];   
        for(int i = 0; i < answer.length; i++) 
        {
           answer[i] =newArr.get(i);
        }        
        return answer;
     }
}