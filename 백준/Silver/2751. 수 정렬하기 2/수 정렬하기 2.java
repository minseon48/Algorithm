import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n;i++){
            String s = br.readLine();
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        for (int i : list) {
            bw.write(String.valueOf(i));
            bw.newLine();

        }

        bw.close();

    }
}