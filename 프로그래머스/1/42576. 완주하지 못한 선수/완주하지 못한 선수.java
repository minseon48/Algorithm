import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String notCompletion = "";
        Map<String,Integer> hs = new HashMap<>();
        for(String s : participant){
            hs.put(s, hs.getOrDefault(s,0)+1);
        }
        for(int i = 0;i<completion.length;i++){
            if(hs.containsKey(completion[i])){
                int originValue = hs.get(completion[i]);
                int newValue = originValue-1;
                hs.put(completion[i],newValue);
            }
        }
        for (Map.Entry<String, Integer> entry : hs.entrySet()) {
            if(entry.getValue() != 0){
               notCompletion = entry.getKey();
            }
        }
        return notCompletion;
    }
}