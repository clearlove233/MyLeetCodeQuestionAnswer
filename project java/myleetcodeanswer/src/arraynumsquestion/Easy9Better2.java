package arraynumsquestion;
/*
 * ����֮��
 * ����Ľⷨ��o(n)
 * �������飬�����������˱Ƚϣ�ȡ��ֵȻ��õ�����
 */
import java.util.Arrays;

public class Easy9Better2 {

	public static int[] twoSum(int[] nums, int target) {
		int[] res=new int[2];
		if(nums==null||nums.length<2) {
			return res;
		}
		int[] nums2=nums.clone();
		Arrays.sort(nums2);
		int left=0;
		int right=nums2.length-1;
		while(left<right) {
			if(nums2[left]+nums2[right]<target) {
				left++;
			}else if(nums2[left]+nums2[right]>target) {
				right--;
			}else {
				break;
			}
		}
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==nums2[left]||nums[i]==nums2[right]) {
				res[j++]=i;
			} 
			if (j>1){
				break;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,3};
		int target=6;
		System.out.println(Arrays.toString(nums));
		System.out.println(" "+target);
		int[] res=twoSum(nums, target);
		System.out.println(Arrays.toString(res));
	}

}
