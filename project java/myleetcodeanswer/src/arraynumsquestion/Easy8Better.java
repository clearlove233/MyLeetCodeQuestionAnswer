package arraynumsquestion;
/*
 * �ƶ���
 * ����˼ά��������Ԫ�ذ���д�����飬ʣ��Ԫ�����㲹�룬ʱ�临�Ӷ�o(n);
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
