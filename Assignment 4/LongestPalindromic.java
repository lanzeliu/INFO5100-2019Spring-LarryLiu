package oopassignment;

public class LongestPalindromic {
    // Dynamic Programming Method, Time: O(n^2), Space: O(n^2)
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int j=0; j<s.length(); j++) {
            for (int i=0; i<=j; i++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && ((j - i <= 2) || dp[i+1][j-1]);
                if (dp[i][j]) {
                    if (j - i + 1 > res.length()) {
                        res = s.substring(i, j+1);
                    }
                }
            }

        }
        return res;
    }

    // Center Enumeration Method, Time: O(n^2), Space: O(1)
    String res = "";
    public String LongestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        for (int i=0; i<s.length(); i++) {
            helper(s, i, i);
            helper(s, i, i+1);
        }
        return res;
    }

    public void helper(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            if ((right - left + 1) > res.length()) {
                res = s.substring(left, right+1);
            }
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        LongestPalindromic lp = new LongestPalindromic();
        System.out.println(lp.longestPalindrome("babad"));
        System.out.println(lp.LongestPalindrome("baad"));
    }
}
