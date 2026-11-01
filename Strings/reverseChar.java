import java.util.Scanner;

public class reverseChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

      String[] words = s.split(" ");

      for(int i = 0; i < words.length; i++) {
        StringBuilder sb = new StringBuilder(words[i]);
        words[i] = sb.reverse().toString();

      }

      String result = String.join(" ", words);
      System.out.println("output: " + result );
      sc.close();
    }
}