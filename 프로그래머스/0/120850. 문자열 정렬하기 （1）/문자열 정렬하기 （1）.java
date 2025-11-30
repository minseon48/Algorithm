import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer= new ArrayList<>();

        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                answer.add(c-'0');//int형 변환
            }
        }

        Collections.sort(answer);//숫자 정렬
        
        return answer;
    }
}