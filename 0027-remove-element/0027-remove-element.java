class Solution {
  public int removeElement(int[] nums, int val) {
    int newVal = 0;
    if (val == 0) {
      newVal = -1;
    }
    int pointer = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[pointer] = nums[i];
        pointer++;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        nums[i] = newVal;
      }
    }
    return pointer;
  }
}