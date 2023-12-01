import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];

        int count = 0;
        Map<Integer,Integer> hs = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int[] cloneArr = arr.clone();
        Arrays.sort(arr);


        for(int i = 0;i<n;i++){
            if(!hs.containsKey(arr[i])){
                hs.put(arr[i],count++);
            }
        }

        for(int i = 0;i<arr.length;i++){
            sb.append(hs.get(cloneArr[i])).append(" ");
        }


        bw.write(sb.toString());
        bw.close();

    }
}