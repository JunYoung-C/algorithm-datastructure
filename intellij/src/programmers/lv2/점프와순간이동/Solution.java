package programmers.lv2.점프와순간이동;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;

        while (n != 1) {
            if (n % 2 == 1) {
                ans++;
                n--;
            } else {
                n /= 2;
            }
        }

        return ans;
    }
}
