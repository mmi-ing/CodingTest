import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int back = -1;
        
        for(int i = 0; i < N; i++) {
            String command = br.readLine();
            
            if(command.startsWith("push")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                queue.offer(x);
                back = x;
            } else if(command.equals("pop")) {
                sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
            } else if(command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            } else if(command.equals("front")) {
                sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
            } else if(command.equals("back")) {
                sb.append(queue.isEmpty() ? -1 : back).append("\n");
            }
        }
        System.out.println(sb);
    }
}