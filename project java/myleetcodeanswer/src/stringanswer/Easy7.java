package stringanswer;
/*
 * ʵ��strstr()����
 * ȷ���Ӵ��������г��ֵ�λ��
 * ˼����
 * �� needle �ǿ��ַ���ʱ������Ӧ������ʲôֵ�أ�����һ���������кܺõ����⡣
 * ���ڱ�����ԣ��� needle �ǿ��ַ���ʱ����Ӧ������ 0 ������C���Ե� strstr() 
 * �Լ� Java�� indexOf() ���������
 * 
 * emmmmm...�ڿ����javaԴ�����⣿��
 */
public class Easy7 {
	public static int strStr(String haystack, String needle) {
		if(needle.isEmpty()) {
			return 0;
		}
		if(haystack.isEmpty()) {
			return -1;
		}
		return haystack.indexOf(needle);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack="hello";
		String needle="ll";
		System.out.println(strStr(haystack, needle));
	}

}
