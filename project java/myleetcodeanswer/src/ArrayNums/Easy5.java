package ArrayNums;
/*
 * �����ⷨ 
 *������������� 
 *����һ�����飬��nums[i]�ֱ���nums[i-1]��nums[i+1]���Ƚϣ���������ͬ�����ҵ�ֻ����һ�ε�ֵ�� 
 *ע���һ�����ֺ����һ�����ֵı߽����
 *ע�����鳤��Ϊһ�����
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
