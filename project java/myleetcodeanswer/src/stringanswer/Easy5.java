package stringanswer;
/*
 * ��֤�����ַ�����������ĸ��Сд
 * ������㷨ͬʱҲ��ʱ������㷨������
 * �л��᳢��C���Ա�д������ʾ˼άģʽ
 */
public class Easy5 {
	public static boolean isPalindrome(String s) {
		if(s==null) {
			return true;
		}
		String temp=s.replaceAll("[^A-Za-z0-9]","").toUpperCase();
        String str=new StringBuffer(temp).reverse().toString();
        return temp.equals(str);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="race a car";
		System.out.println(isPalindrome(str1));
		
	}

}
