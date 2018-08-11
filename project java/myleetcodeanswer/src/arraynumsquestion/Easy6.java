package arraynumsquestion;
/*
 * 给定两个数组，写一个方法来计算他们的交集
 */
import java.util.Arrays;

public class Easy6 {
	
	public static int[] intersect(int[] nums1, int[] nums2){
	   Arrays.sort(nums1);
	   Arrays.sort(nums2);
	   if(nums1.length>nums2.length) {
		   int[] res=sortA(nums2,nums1);
		   return res;
	   }else {
		   int[] res=sortA(nums1,nums2);
		   return res;
	   }
	}
	
	public static int[] sortA(int[] nums1,int[] nums2) {
		int i=0,j=0,k=0;
		int[] res=new int[nums1.length];
		while(i<nums1.length&&j<nums2.length) {//注意这里写一个循环就好了
		   if(nums1[i]>nums2[j]) {
			   j++;
		   }else if(nums1[i]==nums2[j]) {
			   res[k++]=nums1[i];
			   i++;
			   j++;
			   break;
		   }else {
			   i++;
			   break;
		   }
	   }
	   int[] res1=new int[k];
	   for(int m=0;m<k;m++) {
		   res1[m]=res[m];
	   }
	   return res1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2};
		int[] nums2= {1,1};
		int[] res=intersect(nums1, nums2);
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		System.out.println(Arrays.toString(res));
	}
}
