package ArrayNums;

import java.util.Arrays;

/*
 * 加一
 * 感觉和我做的比较起来，其实也就那样。。。。
 */
public class Easy7Better {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i > -1; i--) {
            if (digits[i] == 9 ) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            } 
        }
        int[] newArray = new int[len + 1];
        newArray[0] = 1;
        return newArray;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits= {2,2,9,9};
		System.out.println(Arrays.toString(digits));
		int[] res=plusOne(digits);
		System.out.println(Arrays.toString(res));
	}
}
