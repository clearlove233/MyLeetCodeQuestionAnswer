package arraynumsquestion;
/*
 * 两数之和
 * 优秀的解法，o(n)
 * 利用hashmap键的不重复性来解决问题
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Easy9Better1 {

	public static int[] twoSum(int[] nums, int target) {
		int[] res=new int[2];
		if(nums==null||nums.length<2) {
			return res;
		}
		Map<Integer, Integer> map1=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			if(!map1.containsKey(target-nums[i])) {
				map1.put(nums[i],i);
			}else {
				res[0]=map1.get(target-nums[i]);
				res[1]=i;
				break;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,3};
		int target=6;
		System.out.println(Arrays.toString(nums));
		System.out.println(" "+target);
		int[] res=twoSum(nums, target);
		System.out.println(Arrays.toString(res));
	}

}
