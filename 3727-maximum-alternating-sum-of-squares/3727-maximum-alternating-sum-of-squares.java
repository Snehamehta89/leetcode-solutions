
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans = 0;
        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            ans += arr[n - 1 - i];
            ans -= arr[i];
        }

        if (n % 2 == 1) {
            ans += arr[n / 2];
        }

        return ans;
    }
}
