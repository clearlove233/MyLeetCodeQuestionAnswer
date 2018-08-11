package arraynumsquestion;
/*
 * 移动零
 * 逆向思维，将非零元素按序写入数组，剩余元素用零补齐，时间复杂度o(n);
 */
import java.util.Arrays;

public class Easy8Better {
	
	public static void moveZeroes(int[] nums) {
		int i=0;
		int flag=0;
		while(i<nums.length) {
			if(nums[i]!=0) {
				nums[flag++]=nums[i];
			}
			i++;
		}
		while(flag<nums.length) {
			nums[flag++]=0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0,0,0,1};
		System.out.println(Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

}
