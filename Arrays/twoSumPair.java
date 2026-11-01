public class twoSumPair {
    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int target = -2;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                   found = true;
                   break;
                } 

            }
            if(found) break;
        }
       System.out.print(found);

    }
}
