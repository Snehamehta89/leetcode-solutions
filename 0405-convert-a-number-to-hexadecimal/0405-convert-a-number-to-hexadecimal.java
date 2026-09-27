class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        String hex = "";
        char[] values = "0123456789abcdef".toCharArray();

        while (num != 0) {

            int digit = num & 15;

            hex = values[digit] + hex;

            num = num >>> 4;
        }

        return hex;
    }
}