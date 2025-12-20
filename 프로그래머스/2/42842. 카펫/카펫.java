class Solution {
    public int[] solution(int brown, int yellow) {
        int[] result = new int[2];
        
        int sum = brown + yellow;//전체 카펫 크기
        
        for(int i = 3; i <= sum; i++){
            int width = sum/i;//가로 길이
            int length = i;//세로 길이
            
            if(width >= i){
               if((width - 2) * (length-2) == yellow){
                   result[0] = width;
                   result[1] = length;
                   
                   break;
               }
            }
        }
        
        
        
        
        return result;
    }
}