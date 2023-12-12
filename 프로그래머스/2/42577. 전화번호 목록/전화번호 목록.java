import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
         Map<String,Integer> phoneHash = new HashMap<>();
        boolean answer = true;
        int len = phone_book.length;

        for(int i = 0;i<len;i++){
            phoneHash.put(phone_book[i],i);
        }

        for(int i = 0;i<len;i++){
            for(int j = 1; j<phone_book[i].length();j++){
                if(phoneHash.containsKey(phone_book[i].substring(0,j)))
                    return false;
            }
        }


        return answer;
    }
}