package stringanswer;
/*
 * �ߵ�����
 * ����int�ͣ���������Χ�������10�Ľ���Ͳ����ǰ��Ľ��һ��
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
