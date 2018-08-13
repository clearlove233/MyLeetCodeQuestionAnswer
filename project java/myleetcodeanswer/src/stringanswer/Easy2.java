package stringanswer;
/*
 * 颠倒整数
 * 都用int型，若超出范围，其除以10的结果就不会和前面的结果一致
 */
public class Easy2 {
	public static int reverse(int x) {
		int res=0;
		while(x!=0) {
			int temp=res*10+x%10;
			if(temp/10!=res) {
				return 0;
			}
			res=temp;
			x/=10;
		}
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-123456789;
		System.out.println(reverse(x));
	}

}
