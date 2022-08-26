package Practice_1401_05_13_Part2;

public class LargestRepeatedString {
    public static String largestSubString(String s, String t) {
        int n = Math.min(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.substring(0, i);
            }
        }
        return s.substring(0, n);
    }

    public static void main(String[] args) {
        String string = "fafafatryyunfa";
        String largeRepeatedString = "";
        int n = string.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String x = largestSubString(string.substring(i, n), string.substring(j, n));
                if (x.length() > largeRepeatedString.length()) largeRepeatedString = x;
            }
        }
        System.out.println("Longest repeating sequence: " + largeRepeatedString);
    }
}
