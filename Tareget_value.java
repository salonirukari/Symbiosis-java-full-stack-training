package HomeWork;
/*Given an Array of Integers and One Integer Value as Target Sum, Return the Indexes of 
Two Elements that Add Up to the Target Value*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tareget_value 
{
	public int[] twoSum(int[] nums, int target) {
	    Arrays.sort(nums);
	    int left = 0;
	    int right = nums.length - 1;
	    while (left < right) {
	        int sum = nums[left] + nums[right];
	        if (sum == target) {
	            return new int[] { left, right };
	        } else if (sum < target) {
	            left++;
	        } else {
	            right--;
	        }
	    }
	    return new int[] {}; // or throw an exception
	}
}
