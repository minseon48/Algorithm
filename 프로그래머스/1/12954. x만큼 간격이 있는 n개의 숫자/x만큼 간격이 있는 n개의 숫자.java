class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += x;//x만큼 증가하는 값 합계 구하기
            answer[i] = sum;
        }
        return answer;
    }
}