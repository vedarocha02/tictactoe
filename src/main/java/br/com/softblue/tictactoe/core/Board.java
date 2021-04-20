package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.Constants;
import br.com.softblue.tictactoe.ui.UI;

public class Board {
	
	char[][] matrix;
	
	public Board() {
		matrix = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
		clear();
	}
	
	public void clear() {
		for (int i=0; i < matrix.length; i++) {
			for(int j=0; j< matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
	}

	public void print() {
		for (int i=0; i < matrix.length; i++) {
			for(int j=0; j< matrix[i].length; j++) {
				
				UI.printTextWithNoNewLine(String.valueOf(matrix[i][j]));
				
				if(j < matrix[i].length -1) {
					
				    UI.printTextWithNoNewLine(" | ");
				}
				
			}
			UI.printNewLine();
			
			if(i < matrix[i].length -1) {
				UI.printText("---------");	
			}
			
		}
	}
    
	public boolean isFull() {
		for (int i=0; i < matrix.length; i++) {
			for(int j=0; j< matrix[i].length; j++) {
				if(matrix[i][j] == ' ' ) {
					return false;
				}
			}
		}
		return true;
	}
    
	public boolean play(Player player, Move move) {
		int i = move.i;
		int j = move.j;
		
		matrix[i][j] = player.symbol;
		
		//TODO checar se o jogador ganhou
		return false;
    }
    
}
