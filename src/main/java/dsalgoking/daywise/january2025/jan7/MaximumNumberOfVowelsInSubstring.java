package dsalgoking.daywise.january2025.jan7;

import java.util.ArrayList;
import java.util.List;


public class MaximumNumberOfVowelsInSubstring {
    public static void main(String[] args) {
        System.out.println("LeetCode-643(Medium) MaximumNumberOfVowelsInSubstring");
        String str = "abciiidef";
        int k = 3;
        int result = maxVowels(str, k);
        System.out.println("Result: " + result);
    }

    public static int maxVowels(String s, int k) {
        int i = 0;
        List<Character> window = new ArrayList<>(3);
        while (i < k) {
            if (isVowel(s.charAt(i))) {
                window.add(s.charAt(i));
            }
            i++;
        }
        int maxVow = window.size();

        for (int j = i; j < s.length(); j++) {
            char x = s.charAt(j);
            if(isVowel(x)){
                window.add(x);
            }
            Character y = s.charAt(j - k);
            window.remove(y);
            maxVow = Math.max(window.size(),maxVow);

        }

        return maxVow;

    }

    private static boolean isVowel(char c) {
        if (c == 'a' || c == 'A') {
            return true;
        }

        if (c == 'e' || c == 'E') {
            return true;
        }

        if (c == 'i' || c == 'I') {
            return true;
        }

        if (c == 'o' || c == 'O') {
            return true;
        }
        if (c == 'u' || c == 'U') {
            return true;
        }

        return false;
    }
}
