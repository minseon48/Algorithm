import java.util.*;
    
class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i<progresses.length;i++){
            int minus = 100 - progresses[i];
            int day = minus / speeds[i];
            int div = minus % speeds[i];

            if(div > 0) day++;

            q.add(day);
        }


        int count = 1;
        int now = q.poll();

        while(!q.isEmpty()){
            if(now >= q.peek()){
                count++;
                q.poll();
            }else{
                result.add(count);
                count = 1;
                now = q.poll();
            }
        }
        result.add(count);

        return result;
    }
}