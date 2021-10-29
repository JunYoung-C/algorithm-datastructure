package stack.exam06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public int solution(int n, int k) {
    int answer = 0;
    int cnt = 0;
    Queue<Integer> que = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      que.offer(i);
    }
    while (que.size() > 1) {
      cnt++;
      int value = que.poll();
      if (cnt %k != 0) {
        que.offer(value);
      } 
    }
    
    answer = que.poll();
    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int k = stdIn.nextInt();
    System.out.println(T.solution(n, k));
  }
}
