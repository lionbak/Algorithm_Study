class Solution {
    public String solution(String my_string) {
       StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<my_string.length(); i++){
            char mys = my_string.charAt(i);
            if(mys >= 'a' && mys <='z'){
                sb.append(Character.toUpperCase(mys));
            } else {
                sb.append(Character.toLowerCase(mys));
            }
        }
        return sb.toString();
        // String answer = "";
        // for(int i = 0; i<my_string.length(); i++){
        //     char mys = my_string.charAt(i);
        //     if(mys >= 'a' && mys <= 'z'){
        //         mys = Character.toUpperCase(mys);
        //     } else {
        //         mys = Character.toLowerCase(mys);
        //     }
        //     answer += mys;
        // }  
        //return answer;
    }
}