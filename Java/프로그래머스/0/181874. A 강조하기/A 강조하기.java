class Solution {
    public String solution(String myString) {
        String change = myString.toLowerCase();
        String answer = change.replaceAll("a", "A");
        
        return answer;
    }
}