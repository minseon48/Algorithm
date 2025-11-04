import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);

        for(int i = 0; i < str.length; i++){

            for(int j = 1; j<str.length;j++){
                int num = Integer.parseInt(str[j]);

                if(min > num) min = num;
            }

            for(int j = 1; j<str.length;j++){
                int num = Integer.parseInt(str[j]);

                if(max < num) max = num;
            }

            answer = min + " " + max;

        }

        return answer;
    }
}