/**
 * CodingBat :Array-1 :sameFirstLast
 * Given an array of ints, return true if the array is length 1 or more,
 * and the first element and the last element are equal.
 * @author Kecheng Hu(Caesar)
 * @since 01/27/2026
 * course CS5004 (Object-oriented programming)
 */


public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        if(nums.length == 0) {
            return false;
        }
        return nums[0] == nums[nums.length - 1];

    }
}
