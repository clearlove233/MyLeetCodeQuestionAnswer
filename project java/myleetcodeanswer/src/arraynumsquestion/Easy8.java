package arraynumsquestion;
/*
 *�ƶ���
 *�ж�����Ԫ���Ƿ�Ϊ0��Ϊ0�ͽ�Ԫ��ǰ��
 *ʱ�临�Ӷ�Ϊo(n^2)
 *�����㷨 
 */
import java.util.Arrays;

public class Easy8 {
	
	public static void moveZeroes(int[] nums) {
		int temp=0,i=0;
		int length=nums.length;
		while(i<length){
			if(nums[i]==0) {
				temp=nums[i];
				int j=i;
				for(;j<nums.length-1;j++) {
					nums[j]=nums[j+1];
				}
				nums[j]=temp;
				length--;
			}else {
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0,1,2,0,2,3,4};
		System.out.println(Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

}
