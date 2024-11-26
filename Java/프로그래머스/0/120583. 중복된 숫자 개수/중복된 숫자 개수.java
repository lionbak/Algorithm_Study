import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                    .filter(a -> a == n)
                    .count();
//         int answer = 0;
       
//         for(int a = 0; a<array.length; a++){
//             int value = array[a];
//             if(value == n){
//                 answer++;
//             }
//         }
        // return answer;
    }
}