import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public String solution(String my_string) throws IOException{
        String answer = "";

        for(int i = 0; i<my_string.length();i++){
            if(my_string.indexOf(my_string.charAt(i))==i)
                answer += my_string.charAt(i);
        }
    
        return answer;
    }
}