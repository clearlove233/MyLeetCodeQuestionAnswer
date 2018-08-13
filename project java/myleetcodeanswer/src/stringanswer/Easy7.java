package stringanswer;
/*
 * 实现strstr()函数
 * 确定子串在主串中出现的位置
 * 思考：
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 
 * 以及 Java的 indexOf() 定义相符。
 * 
 * emmmmm...在考察对java源码的理解？？
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
