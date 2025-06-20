class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int[] query : queries){
            int i = query[0];
            int j = query[1];
            
            while (i < j) {
                char temp = answer.charAt(i); // 임시저장
                answer.setCharAt(i, answer.charAt(j));
                answer.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return answer.toString();
    }
}