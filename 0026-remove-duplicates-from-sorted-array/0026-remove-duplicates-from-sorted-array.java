class Solution {
  public int removeDuplicates(int[] nums) {
    
    int pointer = 0;
    int recentValue = -3000;
    
    for (int i = 0; i < nums.length; i++) {
      if (recentValue != nums[i]) {
        nums[pointer] = nums[i];
        pointer++;
        recentValue = nums[i];
      }
    }
    return pointer;
  }
}