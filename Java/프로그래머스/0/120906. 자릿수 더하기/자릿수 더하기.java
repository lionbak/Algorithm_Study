class Solution {
    public int solution(int n) {
        int answer = 0;
        String [] splitNum = String.valueOf(n).split("");
        
        for(String a : splitNum){
            answer += Integer.parseInt(a);
        }
        return answer;
    }
}