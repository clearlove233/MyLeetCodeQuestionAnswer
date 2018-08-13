package stringanswer;
/*
 * 验证回文字符串，忽略字母大小写
 * 最简洁的算法同时也是时间最长的算法。。。
 * 有机会尝试C语言编写，会提示思维模式
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
