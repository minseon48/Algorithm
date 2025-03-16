import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String st = str.toUpperCase();

        int[] arr = new int[26];

        for(int i = 0; i<st.length();i++){
            if(st.charAt(i) >= 65 && st.charAt(i)<=90){
                arr[st.charAt(i)-65]++;
            }
        }

        int max = Integer.MIN_VALUE;
        char result = '?';

        for(int i = 0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                result = (char)(i+65);
            }else if(arr[i] == max){
                result = '?';
            }
        }

        System.out.print(result);

    }
}