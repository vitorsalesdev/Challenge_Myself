package game;

import java.util.Random;
import java.util.Scanner;

public class Battleship {

	public static void main(String[] args) {
		final int LINE= 5, COLUMN = 5, UNIT = 3; 
		int lCount, cCount, i, unitTotal = 0, cL, cC, unitLine, unitColumn;
		char board[][] = new char[LINE][COLUMN];
		int boardCalc[][] = new int[LINE][COLUMN];
		Random rd = new Random();
		Scanner kb = new Scanner(System.in);
		
		
		while(unitTotal != UNIT) {
			unitTotal = 0;
			for(lCount = 0; lCount < LINE; lCount++) {
				for(cCount = 0; cCount < COLUMN; cCount++) {
					boardCalc[lCount][cCount] = rd.nextInt(10) + 2;
					if(boardCalc[lCount][cCount] == 11) {
						boardCalc[lCount][cCount] = 1;
					}
					else {
						boardCalc[lCount][cCount] = 0;
					}
					if(boardCalc[lCount][cCount] == 1 && unitTotal != UNIT) {
						unitTotal++;
					}
				}
			}
		}
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
			board[lCount][cCount] = '~';
			}
		}
		
		while(unitTotal > 0) {
			System.out.println("     1   2   3   4   5");
			System.out.println("    ___________________");
			i = 1;
			for(lCount = 0; lCount < LINE; lCount++) {
				System.out.printf("%d  ", i);
				for(cCount = 0; cCount < COLUMN; cCount++) {
					System.out.printf("| %c ", board[lCount][cCount]);
				}
				System.out.print("|");
				System.out.println();
				i++;
			}
			System.out.println("    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
			System.out.printf("Enter the line number of the shot coordinate: ");
			cL = kb.nextInt() - 1;
			System.out.printf("Enter the column number of the shot coordinate: ");
			cC = kb.nextInt() - 1;
			if(boardCalc[cL][cC] == 0) {
				unitLine = 0;
				unitColumn = 0;
				board[cL][cC] = '*';
				System.out.println("\n\nYou missed the shot");
				for(cCount = 0; cCount < COLUMN; cCount++) {
					if(boardCalc[cL][cCount] == 1) {
						unitLine++;
					}
				}
				for(lCount = 0; lCount < LINE; lCount++) {
					if(boardCalc[lCount][cC] == 1) {
						unitColumn++;
					}
				}
				System.out.printf("\nHint: %d ship(s) on the line %d", unitLine, cL + 1);
				System.out.printf("\n      %d ship(s) on the column %d\n\n", unitColumn, cC + 1);
			}
			else if(boardCalc[cL][cC] == 1) {
				board[cL][cC] = 'X';
				System.out.printf("\nYou hit the ship\n\n");
				unitTotal--;
			}
		}
		System.out.println("     1   2   3   4   5");
		System.out.println("    ___________________");
		i = 0;
		for(lCount = 0; lCount < LINE; lCount++) {
			System.out.printf("%d  ",i);
			for(cCount = 0; cCount < COLUMN; cCount++) {
				System.out.printf("| %c ", board[lCount][cCount]);
			}
			System.out.print("|");
			System.out.println();
			i++;
		}
		System.out.println("    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("Congratulations, you win the game!!!");
		
	}
}