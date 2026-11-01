public class validPalindrome {

    public static boolean isPalindrome(String s) { 
        // 1. Special characters hatana aur lowercase karna
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Yahin code ke andar input string de di hai
        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        if(result) {
            System.out.println("Yes! Yeh ek Palindrome hai.");
        } else {
            System.out.println("No! Yeh Palindrome nahi hai.");
        }
    }
}