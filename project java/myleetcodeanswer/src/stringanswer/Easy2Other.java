package stringanswer;
/*
 * �ߵ�����
 * һ�ּ��İ취��ע��Ҫ��long����Ϊ��ת������ֿ������
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
