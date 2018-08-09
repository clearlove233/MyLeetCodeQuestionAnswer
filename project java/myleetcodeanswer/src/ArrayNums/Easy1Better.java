package ArrayNums;
/*
 * 删除排序数组中的重复项
 */

//方法改进
public class Easy1Better {
	public static int removeDuplicates(int[] nums) {
		int j=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[j]!=nums[i]) {
				nums[++j]=nums[i];	
			}
		}
		return j+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		int j=removeDuplicates(nums);
		for(int i=0;i<j;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.println(j);
	}
}
