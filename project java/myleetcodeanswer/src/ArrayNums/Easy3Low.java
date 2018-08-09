package ArrayNums;
/*
 * Ðý×ªÊý×é
 */
public class Easy3Low {
	public static void rotate(int[] nums, int k) {
		int flag=nums[0];
		for(int i=0;i<k;i++) {
			flag=nums[nums.length-1];
			for(int j=nums.length-2;j>=0;j--) {
				nums[j+1]=nums[j];
			}
			nums[0]=flag;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		rotate(nums,k);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
}
