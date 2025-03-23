import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 2720번 세탁소 사장 동혁
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for(int i = 0; i < n; i++){
            int charge = Integer.parseInt(br.readLine());

            sb.append(charge / quarter).append(" ");
            charge %= quarter;

            sb.append(charge / dime).append(" ");
            charge %= dime;

            sb.append(charge / nickel).append(" ");
            charge %= nickel;

            sb.append(charge / penny).append("\n");
        }

        System.out.print(sb);
    }
}