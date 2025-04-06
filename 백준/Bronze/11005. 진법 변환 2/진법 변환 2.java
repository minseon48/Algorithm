import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        StringBuilder sb = new StringBuilder();

        while(N > 0){
            if(N % B >= 10){
                sb.append((char)((N%B)+55));
            }else{
                sb.append(N%B);
            }

            N/=B;
        }

        System.out.print(sb.reverse());
    }
}
