package dsalgoking.daywise.january2025.jan5;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println("LeetCode-392(Easy) Is Subsequence");
        String s = "abc", t = "ahbgdc";
        boolean result = isSubsequence(s,t);
        System.out.println("Result: "+result);

    }

    public static boolean isSubsequence(String s, String t) {
        int exstCount = 0;
        int j = 0;
        while (exstCount < s.length() && j < t.length()) {
            char sChar = s.charAt(exstCount);
            char tChar = s.charAt(j);
            if (sChar == tChar) {
                exstCount++;
            }

            j++;
        }

        return exstCount == s.length();

    }
}
