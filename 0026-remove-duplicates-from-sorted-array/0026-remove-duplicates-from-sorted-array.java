class Solution {
  public int removeDuplicates(int[] nums) {
    
    int pointer = 0;
    Set<Integer> numbers = new HashSet();
    
    for (int i = 0; i < nums.length; i++) {
      if (!numbers.contains(nums[i])) {
        nums[pointer] = nums[i];
        pointer++;
        numbers.add(nums[i]);
      }
    }
    return pointer;
  }
}