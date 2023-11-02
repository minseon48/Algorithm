import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();

            for (String x : str) {
                String s = new StringBuilder(x).reverse().toString();
                sb.append(s).append(" ");
            }

            System.out.println(sb.toString().trim());
        }


    }
}