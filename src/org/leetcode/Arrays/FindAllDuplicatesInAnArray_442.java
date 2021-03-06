package org.leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class FindAllDuplicatesInAnArray_442 {


  public List<Integer> findDuplicates(int[] nums) {

    List<Integer> outputList = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (nums[Math.abs(nums[i]) - 1] > 0) {
        nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) - 1] * -1;
      } else {
        outputList.add(Math.abs(nums[i]));
      }
    }

    return outputList;
  }


  @Test
  public void testDuplicates() {
    int[] array = {4, 3, 2, 7, 1, 2, 3, 1};
    findDuplicates(array);
  }

}
