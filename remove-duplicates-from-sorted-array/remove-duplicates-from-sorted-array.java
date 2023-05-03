class Solution {
    public int removeDuplicates(int[] nums) {
        int lastNumber = nums[nums.length - 1];
        int lastReadNumber = -200;
        int uniqueNumbers = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == lastNumber) {
                break;
            } else if (nums[i] == nums[i+1]) {
                nums = pushArray(nums, i);
                i--;
            } else if (nums[i] != lastReadNumber) {
                uniqueNumbers++;
                lastReadNumber = nums[i];
            }
        }
        return uniqueNumbers;
    }
    
    private int[] pushArray(int[] numbers, int position) {
        for (int i = position; i < numbers.length - 2; i++) {
            numbers[i+1] = numbers[i+2];
        }
        return numbers;
    }
}