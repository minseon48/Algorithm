import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
         int[] answer = new int[commands.length];
        int len = commands.length;

        for(int i = 0; i<len; i++){
            int sub1 = commands[i][0]-1;
            int sub2 = commands[i][1];

            int[] arrCopy = Arrays.copyOfRange(array, sub1, sub2);
            Arrays.sort(arrCopy);
            int index = commands[i][2]-1;

            answer[i] = arrCopy[index];


        }

        return answer;
    }
}