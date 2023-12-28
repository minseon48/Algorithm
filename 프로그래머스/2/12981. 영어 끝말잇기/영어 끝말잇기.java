import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] result = {0,0};

        Set<String> set = new HashSet<>();

        String currentWord = words[0];
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            char lastCh = currentWord.charAt(currentWord.length() - 1);

            if (lastCh != words[i].charAt(0) || set.contains(words[i])) {
                result[0] = i%n+1;
                result[1] = i/n+1;
                break;
            }

            currentWord = words[i];
            set.add(currentWord);


        }

        return result;
    }
}