class Solution {
    public int[] solution(int[] numbers) {
        int index = numbers.length;
        
        int[] answer = new int[index];
        
        for (int i=0; i<index; i++) {
            answer[i] = numbers[i] * 2;
        }
    
        return answer;
    }
}