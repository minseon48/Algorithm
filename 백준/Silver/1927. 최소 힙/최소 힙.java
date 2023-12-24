import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


class Main {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n;i++){
            int x = Integer.parseInt(br.readLine());
            if(x > 0) heap.add(x);
            else if(x==0 && !heap.isEmpty()) list.add(heap.poll());
            else if(heap.isEmpty()) list.add(0);
        }

        for (Integer result : list) {
            System.out.println(result);
        }

       
    }
}