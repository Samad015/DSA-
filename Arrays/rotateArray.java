
public class rotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
       int n = nums.length;
        k = k % n;

        reverse(nums , 0 ,n-1); //pura revers krdo
        reverse(nums,0,k-1);    //first half reverse
        reverse(nums,k,n-1);          //last half

         for(int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static  void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
