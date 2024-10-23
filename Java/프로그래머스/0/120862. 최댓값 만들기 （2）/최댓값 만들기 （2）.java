import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
            
        int len = numbers.length;
        
        int lowerNumbers = numbers[0] * numbers[1];
        int higherNumbers = numbers[len-1] * numbers[len-2];
        
        if(lowerNumbers > higherNumbers){
            return lowerNumbers;
        }
        return higherNumbers;
    }
}