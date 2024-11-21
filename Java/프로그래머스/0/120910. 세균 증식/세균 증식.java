import java.math.*;
class Solution {
    public int sol(int n, int t){
        if(t==0) return n;
        else {
           n= n*2;
           t= t-1;
          
        }
        return sol(n,t);
    }
    public int solution(int n, int t) {
        int answer = 0;
        answer = sol(n,t);
        return answer;
    }
}