package ArrayNums;
/*
 * ����֮��
 * �����ⷨ��ʱ�临�Ӷ�o(n^2);
 * �����������飻
 * ������?�Լ�˼������Ľⷨ
 */
import java.util.Arrays;

public class Easy9 {
	public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]+nums[j]==target) {
        			res[0]=i;
        			res[1]=j;
        			return res;
        		}
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
