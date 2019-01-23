package leetcode_collection;

/**
 * LongestPalindromicSubstring class
 *
 * @author Soarkey
 * @date 2018/12/30
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        System.out.println(l.longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        if (s.length() == 0){
            return "";
        }
        int n = s.length();
        boolean[][] pal = new boolean[n][n];
        //pal[i][j] 表示s[i...j]是否是回文串
        int maxLen = 0;
        int begin = -1;
        for (int j = 0; j < n; j++) {
            // j作为终点
            int i = j;
            // i作为起点
            while (i >= 0) {
                if (s.charAt(i) == s.charAt(j)
                        && (j - i < 2 || pal[i + 1][j - 1])) {
                    pal[i][j] = true;
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        begin = i;
                    }
                }
                i--;
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}

