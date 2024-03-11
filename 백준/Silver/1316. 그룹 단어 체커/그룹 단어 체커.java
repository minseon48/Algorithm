import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//단어에서 알파벳 하나만 있는 경우 가능, 알파벳이 떨어져 있으면 그룹 단어 아님
//N개의 단어를 입력 받고 그룹 단어의 개수 출력

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i<n;i++){
            if(checkStr(br.readLine())){
                count++;
            }
        }

        System.out.println(count);
        


    }

    public static boolean checkStr(String str) {

        boolean[] check = new boolean[26];//소문자의 수가 26개이기 때문
        int prev = 0;

        for(int i = 0; i<str.length();i++){
            int now = str.charAt(i);
            if(prev != now){
                if(!check[now - 97]){
                    check[now-97] = true;//문자가 나왔으니까 check 해줘야 함
                    prev = now;
                }else{
                    return false;

                }
            }else{
                continue;
            }
        }

        return true;


    }
}