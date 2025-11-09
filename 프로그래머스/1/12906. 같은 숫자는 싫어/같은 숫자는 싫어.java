import java.util.*;

public class Solution {
      public List<Integer> solution(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);


        for(int i = 1; i<arr.length;i++){
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }

        List<Integer> answer = new ArrayList<>();

        while(!stack.isEmpty()){
            answer.add(stack.pop());
        }

        Collections.reverse(answer);

        return answer;


    }
}