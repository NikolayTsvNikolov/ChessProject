import java.util.ArrayList;
import java.util.List;


public class Board {
	
	private final int [][] board = new int [8][8];
	private static int [][] spot = new int [8][8];
	
	private List<PlayingPiece> pieces = new ArrayList<>();
	
	public void initializePieces(){
        
            for(int i=0; i<=8; i++){ // draw pawns
                pieces.add(new Pawn(i, 2, 1));
            }
            pieces.add(new Rook(0, 0, 1));
            pieces.add(new Rook(7, 0, 1));
            pieces.add(new Officer(2, 0, 1));
            pieces.add(new Officer(5, 0, 1));
            pieces.add(new Knight(1, 0, 1));
            pieces.add(new Knight(6, 0, 1));
            pieces.add(new Queen(3, 0, 1));
            pieces.add(new King( 4, 0, 1));
        
        
            for(int i = 0; i <= 8; i++){ // draw pawns
                pieces.add(new Pawn(i,6, 2));
            }
            pieces.add(new Rook(0, 7, 2));
            pieces.add(new Rook(7, 7, 2));
            pieces.add(new Officer(2, 7, 2));
            pieces.add(new Officer(5, 7, 2));
            pieces.add(new Knight(1, 7, 2));
            pieces.add(new Knight(6, 7, 2));
            pieces.add(new Queen(3, 7, 2));
            pieces.add(new King(4, 7, 2));
        }
	
	protected Board (){
		
		for (int i = 0; i < spot.length; i++) {
			System.out.println();
			for (int j = 0; j < spot.length; j++) {
				System.out.print(" " + "|" + " ");
				}
				 
				
	}
	
			
			
		}
	}

	
	
	


