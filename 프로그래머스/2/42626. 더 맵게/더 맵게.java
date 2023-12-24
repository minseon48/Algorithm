import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;

        for(int i = 0; i<scoville.length;i++){
            heap.add(scoville[i]);
            
        }
        while(heap.peek()<K){
            int first = heap.poll();
            int second = heap.poll();

            int sum = first + (second * 2);
            heap.add(sum);
            count++;

            if(heap.peek()>=K) break;
            if(heap.size()==1 && heap.peek()<K) return -1;
        }

        return count;
    }
}