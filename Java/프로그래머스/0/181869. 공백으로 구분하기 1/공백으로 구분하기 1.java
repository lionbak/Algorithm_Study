class Solution {
    public String[] solution(String my_string) {
        String[] div = my_string.split(" ");
        String[] answer = new String[div.length];
        
        for(int i = 0; i < div.length; i++){
            answer[i] = div[i];
        }
        
        return answer;
    }
}