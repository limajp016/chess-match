package application;

import chess.ChessMatch;

public class ChessMain {

	public static void main(String[] args) {
		
		ChessMatch cm = new ChessMatch();
		UI.printBoard(cm.getPieces());
		
	}

}
