import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int index = array.length / 2;
        
        int answer = array[index];
        
        return answer;
    }
}
