package chess.boardGame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] arr = possibleMoves();
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j ++) {
				if (arr[i][j]) {
					return true;
				}
			}
		}
		return true;
	}
}
