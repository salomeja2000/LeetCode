class Solution {
  public int removeElement(int[] nums, int val) {
    int counter = 0;
    int newVal = 0;
    if (val == 0) {
      newVal = -1;
    }
    for (int h = 0; h < nums.length - 1; h++) {
      for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == val) {
          nums[i] = nums[i+1];
          nums[i+1] = val;
        }
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        nums[i] = newVal;
      } else {
        counter++;
      }
    }
    return counter;
  }
}