import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        String[]st = s.split("");
        int sum = 0;

        for(int i = 0; i<st.length;i++){
            sum += Integer.parseInt(st[i]);
        }

        return sum;

       
    }
}