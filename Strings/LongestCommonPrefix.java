import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // Test inputs
        String[] strs = {"flower", "flow", "flight"};
        
        String result = "";
        if (strs != null && strs.length > 0) {
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length - 1];
            int length = Math.min(first.length(), last.length());
            
            int i = 0;
            for (i = 0; i < length; i++) {
                if (first.charAt(i) != last.charAt(i)) {
                    break;
                }
            }
            result = first.substring(0, i);
        }
        
        // Output print karein
        System.out.println("Longest Common Prefix: " + result);
    }
}