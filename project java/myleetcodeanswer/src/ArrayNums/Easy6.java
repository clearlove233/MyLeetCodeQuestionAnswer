package ArrayNums;

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
		while(i<nums1.length) {
			   while(j<nums2.length) {
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
		   }
		   int[] res1=new int[k];
		   for(int m=0;m<k;m++) {
			   res1[m]=res[m];
		   }
		   return res1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,2,1,3,3,2,1,2,2};
		int[] nums2= {2,2,3,4,5};
		int[] res=intersect(nums1, nums2);
		for(int r:res) {
			System.out.print(r+" ");
		}
		System.out.println();
	}
}
