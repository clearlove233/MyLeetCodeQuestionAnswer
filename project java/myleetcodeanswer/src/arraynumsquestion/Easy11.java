package arraynumsquestion;
/*
 * 顺时针旋转数组90度
 * emmmmm....这题其实没什么水平
 */

public class Easy11 {
	public static void rotate(int[][] matrix) {
		//反转然后对称
		int temp=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=i+1;j<matrix.length;j++) {
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
		for(int k=0;k<matrix.length;k++) {
			for(int m=0;m<matrix.length/2;m++) {
				temp=matrix[k][m];
				matrix[k][m]=matrix[k][matrix.length-m-1];
				matrix[k][matrix.length-m-1]=temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m= {{5,1,9,11},{2,4,8,10},{13, 3, 6, 7},{15,14,12,16}};
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		rotate(m);
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
