package ArrayNums;
/*
 * 判断数组是否有重复元素
 */
import java.util.Arrays;

public class Easy4 {
	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,1,3,3,4,3,2,4,2};
		boolean res=containsDuplicate(nums);
		System.out.println(res);
	}
}
