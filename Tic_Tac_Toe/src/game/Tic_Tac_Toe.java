package game;

import java.util.Scanner;

public class Tic_Tac_Toe {

	public static void main(String[] args) {

		final int LINE = 3, COLUMN = 3;
		String matrix[][] = new String[LINE] [COLUMN];
		int ticTacToe[][] = new int[LINE][COLUMN];
		int i, lCount, cCount, turn = 1, play;
		boolean drawn = true;
		Scanner kb = new Scanner(System.in);
		
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				ticTacToe[lCount][cCount] = 0;
			}
		}
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				matrix[lCount][cCount] = " ";
			}
		}
		while(turn < 10) {
			if(turn % 2 != 0) {
				
				System.out.println("\n\n\nThe current game board is:	|	Board legend:");
				System.out.printf("	[%s][%s][%s]		|	[1][2][3]\n", matrix[0][0], matrix[0][1], matrix[0][2]);
				System.out.printf("	[%s][%s][%s]		|	[4][5][6]\n",matrix[1][0], matrix[1][1], matrix[1][2]);
				System.out.printf("	[%s][%s][%s]		|	[7][8][9]\n", matrix[2][0], matrix[2][1], matrix[2][2]);
				System.out.printf("\nPlayer 1 turn. Choose the number corresponding to an empty square on the game board: ");
				play = kb.nextInt();
				for (i = 0; i < 50; ++i)  
				       System.out.println();
				
				if(play == 1 && ticTacToe[0][0] == 0) {
					matrix[0][0] = "X";
					ticTacToe[0][0] = 1;
					turn++;
				}
				else if(play == 2 && ticTacToe[0][1] == 0) {
					matrix[0][1] = "X";
					ticTacToe[0][1] = 1;
					turn++;
				}
				else if(play == 3 && ticTacToe[0][2] == 0) {
					matrix[0][2] = "X";
					ticTacToe[0][2] = 1;
					turn++;
				}
				else if(play == 4 && ticTacToe[1][0] == 0) {
					matrix[1][0] = "X";
					ticTacToe[1][0] = 1;
					turn++;
				}
				else if(play == 5 && ticTacToe[1][1] == 0) {
					matrix[1][1] = "X";
					ticTacToe[1][1] = 1;
					turn++;
				}
				else if(play == 6 && ticTacToe[1][2] == 0) {
					matrix[1][2] = "X";
					ticTacToe[1][2] = 1;
					turn++;
				}
				else if(play == 7 && ticTacToe[2][0] == 0) {
					matrix[2][0] = "X";
					ticTacToe[2][0] = 1;
					turn++;
				}
				else if(play == 8 && ticTacToe[2][1] == 0) {
					matrix[2][1] = "X";
					ticTacToe[2][1] = 1;
					turn++;
				}
				else if(play == 9 && ticTacToe[2][2] == 0) {
				matrix[2][2] = "X";
				ticTacToe[2][2] = 1;
				turn++;
				}
			}
			else {
					
					System.out.println("The current game board is:	|	Board legend:");
					System.out.printf("	[%s][%s][%s]		|	[1][2][3]\n", matrix[0][0], matrix[0][1], matrix[0][2]);
					System.out.printf("	[%s][%s][%s]		|	[4][5][6]\n",matrix[1][0], matrix[1][1], matrix[1][2]);
					System.out.printf("	[%s][%s][%s]		|	[7][8][9]\n", matrix[2][0], matrix[2][1], matrix[2][2]);
					System.out.printf("\nPlayer 2 turn. Choose the number corresponding to an empty square on the game board: ");
					play = kb.nextInt();
					for (i = 0; i < 50; ++i)  
					       System.out.println(); 
					
					if(play == 1 && ticTacToe[0][0] == 0) {
						matrix[0][0] = "O";
						ticTacToe[0][0] = 2;
						turn++;
					}
					else if(play == 2 && ticTacToe[0][1] == 0) {
						matrix[0][1] = "O";
						ticTacToe[0][1] = 2;
						turn++;
					}
					else if(play == 3 && ticTacToe[0][2] == 0) {
						matrix[0][2] = "O";
						ticTacToe[0][2] = 2;
						turn++;
					}
					else if(play == 4 && ticTacToe[1][0] == 0) {
						matrix[1][0] = "O";
						ticTacToe[1][0] = 2;
						turn++;
					}
					else if(play == 5 && ticTacToe[1][1] == 0) {
						matrix[1][1] = "O";
						ticTacToe[1][1] = 2;
						turn++;
					}
					else if(play == 6 && ticTacToe[1][2] == 0) {
						matrix[1][2] = "O";
						ticTacToe[1][2] = 2;
						turn++;
					}
					else if(play == 7 && ticTacToe[2][0] == 0) {
						matrix[2][0] = "O";
						ticTacToe[2][0] = 2;
						turn++;
					}
					else if(play == 8 && ticTacToe[2][1] == 0) {
						matrix[2][1] = "O";
						ticTacToe[2][1] = 2;
						turn++;
					}
					else if(play == 9 && ticTacToe[2][2] == 0) {
					matrix[2][2] = "O";
					ticTacToe[2][2] = 2;
					turn++;
					}
				}
			if((ticTacToe[0][0] == 1 && ticTacToe[0][1] == 1 && ticTacToe[0][2] == 1 || ticTacToe[1][0] == 1 && ticTacToe[1][1] == 1 && ticTacToe[1][2] == 1 ||ticTacToe[2][0] == 1 && ticTacToe[2][1] == 1 && ticTacToe[2][2] == 1 || ticTacToe[0][0] == 1 && ticTacToe[1][0] == 1 && ticTacToe[2][0] == 1 || ticTacToe[0][1] == 1 && ticTacToe[1][1] == 1 && ticTacToe[2][1] == 1 || ticTacToe[0][2] == 1 && ticTacToe[1][2] == 1 && ticTacToe[2][2] == 1 || ticTacToe[0][0] == 1 && ticTacToe[1][1] == 1 && ticTacToe[2][2] == 1 || ticTacToe[0][2] == 1 && ticTacToe[1][1] == 1 && ticTacToe[2][0] == 1)) {
				System.out.println("The final game board is: ");
				System.out.printf("	[%s][%s][%s]\n", matrix[0][0], matrix[0][1], matrix[0][2]);
				System.out.printf("	[%s][%s][%s]\n",matrix[1][0], matrix[1][1], matrix[1][2]);
				System.out.printf("	[%s][%s][%s]\n", matrix[2][0], matrix[2][1], matrix[2][2]);
				System.out.println("\nPlayer 1 win.");
				drawn = false;
				turn = 10;
			}
			else if(ticTacToe[0][0] == 2 && ticTacToe[0][1] == 2 && ticTacToe[0][2] == 2 || ticTacToe[1][0] == 2 && ticTacToe[1][1] == 2 && ticTacToe[1][2] == 2 ||ticTacToe[2][0] == 2 && ticTacToe[2][1] == 2 && ticTacToe[2][2] == 2 || ticTacToe[0][0] == 2 && ticTacToe[1][0] == 2 && ticTacToe[2][0] == 2 || ticTacToe[0][1] == 2 && ticTacToe[1][1] == 2 && ticTacToe[2][1] == 2 || ticTacToe[0][2] == 2 && ticTacToe[1][2] == 2 && ticTacToe[2][2] == 2 || ticTacToe[0][0] == 2 && ticTacToe[1][1] == 2 && ticTacToe[2][2] == 2 || ticTacToe[0][2] == 2 && ticTacToe[1][1] == 2 && ticTacToe[2][0] == 2) {
				System.out.println("The final game board is: ");
				System.out.printf("	[%s][%s][%s]\n", matrix[0][0], matrix[0][1], matrix[0][2]);
				System.out.printf("	[%s][%s][%s]\n",matrix[1][0], matrix[1][1], matrix[1][2]);
				System.out.printf("	[%s][%s][%s]\n", matrix[2][0], matrix[2][1], matrix[2][2]);
				System.out.println("\nPlayer 2 win.");
				drawn = false;
				turn = 10;
			}
		}
		if(drawn == true) {
			System.out.println("The final game board is: ");
			System.out.printf("	[%s][%s][%s]\n", matrix[0][0], matrix[0][1], matrix[0][2]);
			System.out.printf("	[%s][%s][%s]\n",matrix[1][0], matrix[1][1], matrix[1][2]);
			System.out.printf("	[%s][%s][%s]\n", matrix[2][0], matrix[2][1], matrix[2][2]);
			System.out.println("\nMatch drawn");
		}
	}
}