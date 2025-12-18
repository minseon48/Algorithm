class Solution {
    public int solution(int n) {
        int[] answer = new int[n+1];
        int num = 1234567;
        
        answer[0] = 0;
        answer[1] = 1;
        
        for(int i=2;i<=n;i++){
            answer[i] = (answer[i-2] + answer[i-1]) % num;//피보나치 수 1234567로 나눔
        }
        

        return answer[n];

    }
}