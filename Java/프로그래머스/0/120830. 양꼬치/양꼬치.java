
class Solution {
    public int solution(int n, int k) {
        int sheep = 12000;
        int drink = 2000;
        int service = 0;
        int answer = 0;
        
        
        if(n >= 10) {
            service = (n / 10) * drink;
            
        }
        answer = (sheep * n) + (drink * k - service);
        return answer;
    }
}