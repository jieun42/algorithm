import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int maxCount = 0;
        int maxNum = -1;
        boolean isDuplicate = false;
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxNum = num;
                isDuplicate = false; // 새로운 최빈값이므로 중복 해제
            } else if (count == maxCount) {
                isDuplicate = true; // 동일한 빈도수를 가진 값이 있음
            }
        }

        return isDuplicate ? -1 : maxNum;
    }
}