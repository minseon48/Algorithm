import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        int num; 

        int length = N.length()-1;

        for(int i = 0; i<=length;i++){
            char ch = N.charAt(length-i);
            if(ch >= 'A' && ch <= 'Z'){
                num = ch-55;
                result += (int)Math.pow(B,i)*num;
            }else{
                num = ch-'0';
                result += (int) (Math.pow(B,i)*num);
            }
        }

        System.out.print(result);
    }
}
