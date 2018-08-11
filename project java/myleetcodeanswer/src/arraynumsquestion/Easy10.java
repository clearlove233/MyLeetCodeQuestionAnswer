package arraynumsquestion;

import java.util.Arrays;
import java.util.HashSet;

public class Easy10 {
	public static boolean isValidSudoku(String[][] board) {
		HashSet<String> hs=new HashSet<String>();
		//按行
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(hs.contains(board[i][j])){
					return false;
				}else if(board[i][j]!="."){
					hs.add(board[i][j]);
				}		
			}
			hs.clear();
		}
		hs.clear();
		//按列
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(hs.contains(board[j][i])){
					return false;
				}else if(board[j][i]!=".") {
					hs.add(board[j][i]);
				}		
			}
			hs.clear();
		}
		//按块
		for(int i=0;i<9;i=i+3) {
			for(int k=0;k<9;k=k+3){
				for(int j=i;j<i+3;j++) {
					for(int m=k;m<k+3;m++) {
						if(hs.contains(board[j][m])){
							return false;
						}else if(board[j][m]!=".") {
							hs.add(board[j][m]);
						}		
					}
					hs.clear();
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] num= {{"5","3",".",".","7",".",".",".","."},
				{"6",".",".","1","9","5",".",".","."},
				{".","9","8",".",".",".",".","6","."},
				{"8",".",".",".","6",".",".",".","3"},
				{"4",".",".","8",".","3",".",".","1"},
				{"7",".",".",".","2",".",".",".","6"},
				{".","6",".",".",".",".","2","8","."},
				{".",".",".","4","1","9",".",".","5"},
				{".",".",".",".","8",".",".","7","9"}};
		for(String[] str1:num) {
			System.out.println(Arrays.toString(str1));
		}
		System.out.println(isValidSudoku(num));
	}
}
