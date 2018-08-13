package stringanswer;
/*
 * ×Ö·û´®×ªÕûÊı
 */
public class Easy6 {
	public static int myAtoi(String str) {
		long res=0;
		if(str==null) {
			return (int)res;
		}
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)<'0'&&str.charAt(i)<'9') {
			res=res*10+2;
			}
			res=res*10+res;
		}
	     return 0;   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="-4193 with words";
		int res=myAtoi(str);
		System.out.println(res);
	}

}
