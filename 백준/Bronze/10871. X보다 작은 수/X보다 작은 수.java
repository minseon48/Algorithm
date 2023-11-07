import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = (br.readLine().split(" "));
        int n = Integer.parseInt(str1[0]);
        int x = Integer.parseInt(str1[1]);

        String[] str2  = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<n;i++){
           int num = Integer.parseInt(str2[i]);
           if(num<x){
               sb.append(num).append(" ");
           }
        }
        System.out.println(sb);
    }
}