package stringanswer;
/*
 * 字符串中的第一个唯一字符
 * 我选择用linkedhashmap做，其实大材小用 o(╥﹏╥)o，效率并不高
 * 将字符串转换为char数组：char[] ch1=s.toCharArray();
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class Easy3 {
	public static int firstUniqChar(String s) {
		LinkedHashMap<Character, Integer> hs1=new LinkedHashMap<Character,Integer >();
		char[] ch1=s.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			if(hs1.containsKey(ch1[i])) {
				hs1.put(ch1[i], hs1.get(ch1[i])+1);
			}else {
				hs1.put(ch1[i], 1);
			}
		}
		for(Map.Entry<Character, Integer>entry:hs1.entrySet()) {
			if(entry.getValue()==1) {
				return s.indexOf(entry.getKey());
			}
		}
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="leetcode";
		System.out.println(str1);
		System.out.println(firstUniqChar(str1));
	}

}
