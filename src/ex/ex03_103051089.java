package ex;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 103051089 林冠磊
 */

import java.util.Scanner;

public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] line = new String[3];
		String[][] game = new String[3][3];
		for(int i = 0; i < line.length; i++){
			line[i] = sc.nextLine();
			game[i]=line[i].split(" ");
		}		
//		for(int i = 0; i < game.length; i++){
//			for(int j = 0; j < game[0].length; j++){
//				System.out.print(game[i][j]);
//			}
//			System.out.println();
//		}
		boolean isWin = false;
		for(int i = 0; i < game.length; i++){			
			if(game[i][0].equals(game[i][1]) && game[i][1].equals(game[i][2])){
				isWin = true;
			}				
		}
		for(int i = 0; i < game[0].length; i++){			
			if(game[0][i].equals(game[1][i]) && game[1][i].equals(game[2][i])){
				isWin = true;
			}				
		}
		if(game[0][0].equals(game[1][1]) && game[1][1].equals(game[2][2])){
			isWin = true;
		}
		if(game[0][2].equals(game[1][1]) && game[1][1].equals(game[2][0])){
			isWin = true;
		}
		if(isWin == true){
			System.out.println("Ture");
		}else{
			System.out.println("False");
		}
	}

}
