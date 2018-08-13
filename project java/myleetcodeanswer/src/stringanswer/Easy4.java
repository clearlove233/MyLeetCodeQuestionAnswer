package stringanswer;
/*
 * 有效的字母异位词
 * hashmap做法，较复杂，在此题中大材小用
 */
import java.util.HashMap;

public class Easy4 {
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		HashMap<Character, Integer> hs1=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(hs1.containsKey(s.charAt(i))) {
				hs1.put(s.charAt(i), hs1.get(s.charAt(i))+1);
			}else {
				hs1.put(s.charAt(i), 1);
			}
		}
		System.out.println(hs1);
		for(int i=0;i<t.length();i++){
			if(hs1.containsKey(t.charAt(i))) {
				hs1.put(t.charAt(i), hs1.get(t.charAt(i))-1);
			}else {
				return false;
			}
		}
		System.out.println(hs1);
		for(Integer i:hs1.values()) {
			if(i!=0) {
				return false;
			}
		}
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sssa";
		String t="asss";
		System.out.println(isAnagram(s, t));
	}

}
