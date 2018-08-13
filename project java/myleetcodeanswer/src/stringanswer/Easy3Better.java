package stringanswer;
/*
 * 字符串中的第一个唯一字符
 * 优秀的算法，活用indexof和lastindexof来判断
 */
public class Easy3Better {
	
	public static int firstUniqChar(String s) {
		int result=-1;
		for(char c='a';c<='z';c++) {
			int index=s.indexOf(c);
			if(index!=-1&&index==s.lastIndexOf(c)) {
				result=result!=-1?Math.min(result, index):index;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="leetcode";
		System.out.println(str1);
		System.out.println(firstUniqChar(str1));
	}

}
