package ArrayNums;
/*
 * 暴力解法 
 *对数组进行排序。 
 *遍历一次数组，将nums[i]分别与nums[i-1]和nums[i+1]作比较，若都不相同，则找到只出现一次的值。 
 *注意第一个数字和最后一个数字的边界情况
 *注意数组长度为一的情况
 */
import java.util.Arrays;

public class Easy5 {
	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		if(nums.length==1||nums[0]!=nums[1]) {
			return nums[0];
		}
		if(nums[nums.length-1]!=nums[nums.length-2]) {
			return nums[nums.length-1];
		}
		for(int i=1;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]) {
				return nums[i];
			}
		}
		return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1};
		int s1=singleNumber(nums);
		System.out.println(s1);
	}

}
