package ArrayNums;
/*
 * Ðý×ªÊý×é
 */
public class Easy3Better {
	public static void reverse(int[] nums,int left,int right) {
		while(left<right) {
			int temp;
			temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}
	
	public static void rotate(int[] nums, int k) {
		k%=nums.length;
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7};
		int k=8;
		rotate(nums,k);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
}
