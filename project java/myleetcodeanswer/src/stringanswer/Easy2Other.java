package stringanswer;
/*
 * 颠倒整数
 * 一种简洁的办法，注意要用long，以为反转后的数字可能溢出
 */
public class Easy2Other {
	public static int reverse(int x) {
		long res=0;
		while(x!=0) {
			res=res*10+x%10;
			x/=10;
		}
		return res<Integer.MIN_VALUE||res>Integer.MAX_VALUE?0:(int)res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-1234567891;
		System.out.println(reverse(x));
	}

}
