public class moveZero {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 0, 3, 0, 2 };
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;

            }

        }
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
