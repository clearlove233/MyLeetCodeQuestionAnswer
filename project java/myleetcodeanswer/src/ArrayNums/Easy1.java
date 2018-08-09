package ArrayNums;
/*
 * 删除排序数组中的重复项
 */

//笨办法
public class Easy1 {
		public static int removeDuplicates(int[] nums) {
		int length=nums.length;
		for(int i=0;i<length;i++){
			int j=i+1;
            while(j<length){
                if(nums[i]==nums[j]){
                    for(int k=j;k<length-1;k++){
                        nums[k]=nums[k+1];
                    }
                    length--;
                }else {
                	j++;
                } 
            }
        }
        return length;
    }		            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		int j=removeDuplicates(nums);
		for(int i=0;i<j;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.println(j);
	}

}
