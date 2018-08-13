package stringanswer;

/*
 * 查找字符串数组中的最长公共前缀	
 */

public class Easy9 {
	public static String longestCommonPrefix(String[] strs) {
		String nothing="";
		if(strs==null) {
			return nothing;
		}
		char[] common=strs[0].toCharArray();
		for(int i=1;i<strs.length;i++) {
			int count=0;
			while(count<common.length&&count<strs[i].length()) {
				if(common[count]!=strs[i].charAt(count)) {
					break;
				}
			}
			if(count==0) {
				return nothing;
			}
			common=strs[i].substring(0, count).toCharArray();
		}
		return common.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strings));
	}

}
