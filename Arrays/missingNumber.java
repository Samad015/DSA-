public class missingNumber {

    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        // sum we have
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println(missing);

    }
}