import java.util.ArrayList;
import java.util.List;

public class Board {

	private final PlayingPiece[][] board = new PlayingPiece[8][8];

	public void initializePieces() {

		for (int i = 0; i < 8; i++) { // draw pawns
			board[i][2] = (new Pawn(i, 2, 1));
		}
		board[0][0] = (new Rook(0, 0, 1));
		board[7][0] = (new Rook(7, 0, 1));
		board[2][0] = (new Officer(2, 0, 1));
		board[5][0] = (new Officer(5, 0, 1));
		board[1][0] = (new Knight(1, 0, 1));
		board[6][0] = (new Knight(6, 0, 1));
		board[3][0] = (new Queen(3, 0, 1));
		board[4][0] = (new King(4, 0, 1));

		for (int i = 0; i < 8; i++) { // draw pawns
			board[i][6] = (new Pawn(i, 6, 2));
		}
		board[0][7] = (new Rook(0, 7, 2));
		board[7][7] = (new Rook(7, 7, 2));
		board[2][7] = (new Officer(2, 7, 2));
		board[5][7] = (new Officer(5, 7, 2));
		board[1][7] = (new Knight(1, 7, 2));
		board[6][7] = (new Knight(6, 7, 2));
		board[3][7] = (new Queen(3, 7, 2));
		board[4][7] = (new King(4, 7, 2));
	}

	protected Board() {
			initializePieces();
		for (int i = 0; i < board.length; i++) {
			System.out.println();
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == null) {
					System.out.print("|" + " ");
				} else {
					System.out.print("|" + board[i][j].getCharacter());

				}
			}
		}

	}

}
