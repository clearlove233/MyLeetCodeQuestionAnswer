package stringanswer;
/*
 * 确定子串在主串出现的位置
 * substring(int firstindex,int lastindex)
 */
public class Easy7Other {
	public static int strStr(String haystack, String needle) {
		if(needle.isEmpty()) {
			return 0;
		}
		for(int i=0;i+needle.length()<=haystack.length();i++) {
			if(haystack.substring(i, i+needle.length()).equals(needle)) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack="aaaaa";
		String needle="bba";
		System.out.println(strStr(haystack, needle));
	}
}
