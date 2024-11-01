import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numList) {
    
        int[] answer = Arrays.stream(numList)
                             .filter(v -> v % n == 0)
                             .toArray();
        
        return answer;
    }
}