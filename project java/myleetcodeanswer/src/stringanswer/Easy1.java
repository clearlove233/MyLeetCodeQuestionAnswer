package stringanswer;
/*
 * 反转字符串
 * ??这题也太。。。emmmm
 */
public class Easy1 {
	public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="A man, a plan, a canal: Panama";
		System.out.println(reverseString(str1));
	}

}
