package stringanswer;
/*
 *  有效的字母异位词
 *  简易的做法
 */
public class Easy4Other {
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		int[] num=new int[26];
		for(int i=0;i<s.length();i++) {
			num[s.charAt(i)-97]++;
		}
		for(int i=0;i<t.length();i++) {
			num[t.charAt(i)-97]--;
		}
		for(int i=0;i<26;i++) {
			if(num[i]!=0) {
				return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sss";
		String t="sss";
		System.out.println(isAnagram(s, t));
	}

}
