import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int N = numbers.length;
        
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                int n=numbers[i]+numbers[j];
                if(!ans.contains(n))
                    ans.add(n);
            }
        }
        
        answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++)
            answer[i] = ans.get(i);
        
        for(int i=0; i<answer.length-1; i++){
            int min = i;
            for(int j=i+1; j<answer.length; j++)
                if(answer[j] < answer[min])
                    min = j;
            int temp;
            temp = answer[i];
            answer[i] = answer[min];
            answer[min] = temp;
        }
    
        return answer;
    }
}