import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n];
        int minSum = 0;
        String[] s = br.readLine().split(" ");

        for(int i = 0; i<n;i++){
           p[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(p);

        for(int i = 1;i<n;i++){
            p[i] = p[i-1]+p[i];

        }

        for(int i = 0;i<n;i++){
            minSum += p[i];
        }

        System.out.print(minSum);

    }
}