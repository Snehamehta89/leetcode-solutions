class Solution {
    public boolean isPalindrome(String s) {

        String s1 = "";

        // Remove non-alphanumeric and convert to lowercase
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                s1 += Character.toLowerCase(ch);
            }
        }

        // Reverse
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }

        return s1.equals(s2);
    }
}