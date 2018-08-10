package ArrayNums;

import java.util.HashSet;

public class Easy10 {
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> hs=new HashSet<Character>();
		//按行
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(hs.contains(board[i][j])){
					return false;
				}else {
					hs.add(board[i][j]);
				}		
			}
			hs.clear();
		}
		//按列
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(hs.contains(board[j][i])){
					return false;
				}else {
					hs.add(board[j][i]);
				}		
			}
			hs.clear();
		}
		//按块
		for(int i=0;i<9;i=i+3) {
			for(int k=0;k<9;k++){
				for(int j=i;j<i+3;j++) {
					for(int m=k;m<k+3;k++) {
						if(hs.contains(board[j][m])){
							return false;
						}else {
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
		
	}

}
