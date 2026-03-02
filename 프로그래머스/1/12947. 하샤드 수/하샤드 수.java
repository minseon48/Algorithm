class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        
        String s = String.valueOf(x);
        String[] num = s.split("");
        
        for(int i = 0; i<num.length; i++){
            sum += Integer.parseInt(num[i]);
        }
        
        if(x % sum == 0) {
            answer = true;
            return answer;
        }
        
        
        return answer;
    }
}