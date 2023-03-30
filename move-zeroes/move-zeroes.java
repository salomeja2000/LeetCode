class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i - 1] == 0) {
                for (int j = i; j <= nums.length - 1; j++) {
                    if (nums[j] == 0) {
                        break;
                    }
                    temp = nums[j];
                    nums[j] = 0;
                    nums[j - 1] = temp;
                }
            }
        }
    }
}