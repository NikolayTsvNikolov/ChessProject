import java.util.ArrayList;
import java.util.List;

public class Board {

	private final PlayingPiece[][] board = new PlayingPiece[8][8];

	public void initializePieces() {

		for (int i = 0; i < 8; i++) { // draw pawns
			board[1][i] = (new Pawn(1, i, 1));
		}
		board[0][0] = (new Rook(0, 0, 1));
		board[0][7] = (new Rook(0, 7, 1));
		board[0][2] = (new Officer(0, 2, 1));
		board[0][5] = (new Officer(0, 5, 1));
		board[0][1] = (new Knight(0, 1, 1));
		board[0][6] = (new Knight(0, 6, 1));
		board[0][3] = (new Queen(0, 3, 1));
		board[0][4] = (new King(0, 4, 1));

		for (int i = 0; i < 8; i++) { // draw pawns
			board[6][i] = (new Pawn(6, i, 2));
		}
		board[7][0] = (new Rook(7, 0, 2));
		board[7][7] = (new Rook(7, 7, 2));
		board[7][2] = (new Officer(7, 2, 2));
		board[7][5] = (new Officer(7, 5, 2));
		board[7][1] = (new Knight(7, 1, 2));
		board[7][6] = (new Knight(7, 6, 2));
		board[7][3] = (new Queen(7, 3, 2));
		board[7][4] = (new King(7, 4, 2));
	}

	protected Board() {
			initializePieces();
		for (int i = 0; i < board.length; i++) {
			System.out.println();
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == null && j == 7) {
					System.out.print("|" + " " + "|");
				}else if (board[i][j] == null) {
					System.out.print("|" + " ");
				} else if (board[i][j] != null && j == 7){
					System.out.print("|" + board[i][j].getCharacter() + "|");
				}	else {
					System.out.print("|" + board[i][j].getCharacter());

				}
			}
		}

	}

}
