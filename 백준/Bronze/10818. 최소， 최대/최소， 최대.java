import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        int min = num[0], max = num[0];
        for(int x : num){
            if(x>max){
                max = x;
            }else if(x<min){
                min = x;
            }
        }

        bw.write(min + " " + max);
        bw.close();

    }
}