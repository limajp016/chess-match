package application;

import chess.ChessMatch;
import chess.boardGame.Board;
import chess.boardGame.Position;

public class ChessMain {

	public static void main(String[] args) {
		
		ChessMatch cm = new ChessMatch();
		UI.printBoard(cm.getPieces());
		
	}

}
