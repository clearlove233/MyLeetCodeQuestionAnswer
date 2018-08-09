package ArrayNums;

public class Easy2 {
	public static int maxProfit(int[] prices) {
		int max=0;
		for(int i=0;i<prices.length-1;i++) {
			if(prices[i]<prices[i+1]) {
				max+=prices[i+1]-prices[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {7,1,5,3,6,4};
		int j=maxProfit(nums);
		System.out.println(j);
	}

}
