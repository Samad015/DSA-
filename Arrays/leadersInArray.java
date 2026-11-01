import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class leadersInArray {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();

        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;

        int maxRight = arr[n - 1];
        result.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(maxRight);

            }

        }

        Collections.reverse(result);
            System.out.print(result);
    }
}
