package arraynumsquestion;

import java.util.Arrays;

/*
 * 题目：加一
 * 优点：执行速度快
 * 缺点：代码冗余，不够简练
 */
public class Easy7 {

	public static int[] plusOne(int[] digits) {
		int j=judgeNum(digits);
		if(j>=0) {
			digits[j]+=1;
			for(int k=j+1;k<digits.length;k++) {
				digits[k]=0;
			}
			return digits;
		}else {
			int[] num=new int[digits.length+1];
			num[0]=1;
			return num;
		}
	}
	
	public static int judgeNum(int[] digits) {
		int i=digits.length-1;
		while(i>=0&&digits[i]==9) {
			i--;
		}
		if(digits[0]==9&&i==-1) {
			return -1;
		}else {
			return i;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits= {2,2,9,9};
		System.out.println(Arrays.toString(digits));
		int[] res=plusOne(digits);
		System.out.println(Arrays.toString(res));
	}

}
