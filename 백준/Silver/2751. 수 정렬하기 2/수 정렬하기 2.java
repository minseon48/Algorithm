import java.io.*;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<Integer> treeSet = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n;i++){
            String s = br.readLine();
            treeSet.add(Integer.parseInt(s));
        }

        for (int i : treeSet) {
            bw.write(String.valueOf(i));
            bw.newLine();

        }

        bw.close();

    }
}