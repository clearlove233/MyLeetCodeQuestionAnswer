package arraynumsquestion;
/*
 * λ����
 * ��������У��κ�һ�����ֺ����Լ����������0��
 * �κ�һ�����ֺ�0����Ǳ���
 * 
 */
public class Easy5Better {
	public static int singleNumber(int[] nums) {
		if(nums.length==0) {
			return -1;
		}
		int res=0;
		for(int i=0;i<nums.length;i++) {
			res ^=nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,2,3};
		int s1=singleNumber(nums);
		System.out.println(s1);
	}

}
