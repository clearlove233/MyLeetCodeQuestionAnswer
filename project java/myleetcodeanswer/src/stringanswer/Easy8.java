package stringanswer;

/*
 * 数数并说
 */
public class Easy8 {
	
	public static String countAndSay(int n) {
		String str1="1";
		String temp="";
		for(int i=2;i<=n;i++) {
			int j=0,k=0;
			while(j<str1.length()&&k<str1.length()) {
				if(str1.charAt(j)==str1.charAt(k)) {
					temp=temp+"k-j+1"+str1.charAt(j);
					j=k;
					continue;
				}
				k++;
			}
			str1=temp;
			temp="";
		}
        return str1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(3));
	}

}
