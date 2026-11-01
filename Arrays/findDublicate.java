import java.util.HashSet;

class findDublicate {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.println(arr[i]);
            }
        }

    }
}
