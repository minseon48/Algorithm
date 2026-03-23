import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> ponkemon = new HashSet<>();
        int total = nums.length/2;
        
        for(int i = 0; i<nums.length;i++){
            ponkemon.add(nums[i]);
        }
        
        int result = ponkemon.size();
        
        if(result > total) result = total;//선택해야하는 것보다 종류 수가 많을 경우
        
        return result;
        
        
    }
}