class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] div = my_string.split("");
        for(int i = 0; i<my_string.length(); i++){
            answer += div[i].repeat(n);
        }
        return answer;
    }
}