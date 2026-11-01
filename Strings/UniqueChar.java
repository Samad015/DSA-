public class UniqueChar {

    public static void main(String[] args) {
   String s = "leetcode";
        int[] freq = new int[26];

        for(int i =0; i<s.length();i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
boolean found = false;
  for(int i =0; i<s.length();i++) {
            char ch = s.charAt(i);
            if(freq[ch - 'a']==1) {
                System.out.println(i);
                found = true;
                break;

            }
        }
        if(!found) {
            System.out.println("-1");
        }
    }
}