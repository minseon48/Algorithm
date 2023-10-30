class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count1 = 0, count2 = 0;
        s = s.toUpperCase();
        for(char str : s.toCharArray()){
            if(str =='P')
                count1++;
            else if(str == 'Y')
                count2++;
        }
        if(count1 == 0 && count2 == 0)
           return answer;
        else if(count1 == count2)
            return answer;
        else
            return false;
    }
}
