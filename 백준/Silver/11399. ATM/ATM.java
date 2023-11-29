import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n];
        int minSum = 0;
        String[] s = br.readLine().split(" ");
        for(String x : s){
            list.add(Integer.parseInt(x));
        }
        Collections.sort(list);
        for(int i = 0; i<n;i++){
           p[i] = list.get(i);
        }
        for(int i = 1;i<n;i++){
            p[i] = p[i-1]+p[i];

        }

        for(int i = 0;i<n;i++){
            minSum += p[i];
        }

        System.out.print(minSum);

    }
}