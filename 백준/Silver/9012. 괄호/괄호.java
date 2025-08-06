import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            
            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if(stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(!stack.isEmpty()) isValid = false;
            sb.append(isValid ? "YES" : "NO").append("\n");
        }
        System.out.println(sb);
    }
}