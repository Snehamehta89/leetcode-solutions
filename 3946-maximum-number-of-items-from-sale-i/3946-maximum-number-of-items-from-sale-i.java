import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;
        int minPrice = 1501;

        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, items[i][1]);
        }

        int[] value = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % items[i][0] == 0) {
                    count++;
                }
            }

            value[i] = count + 1;
        }

        int[] dp = new int[budget + 1];

        for (int i = 0; i < n; i++) {
            int price = items[i][1];

            for (int j = budget; j >= price; j--) {
                dp[j] = Math.max(dp[j], dp[j - price] + value[i]);
            }
        }

        int answer = 0;

        for (int i = 0; i <= budget; i++) {
            int total = dp[i] + (budget - i) / minPrice;
            answer = Math.max(answer, total);
        }

        return answer;
    }
}