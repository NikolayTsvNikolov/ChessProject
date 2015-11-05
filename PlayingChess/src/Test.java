import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		Board board = new Board();
		
		
//		Officer peshoCheren = new Officer(3, 0, PlayingPiece.COLOR_BLACK);
//		Officer goshoCheren = new Officer(5, 0, PlayingPiece.COLOR_BLACK);
//		Pawn p1 = new Pawn(0, 1, PlayingPiece.COLOR_BLACK);
//		Pawn p2 = new Pawn(0, 2, PlayingPiece.COLOR_BLACK);
//		Pawn p3 = new Pawn(0, 3, PlayingPiece.COLOR_BLACK);
//		Pawn p4 = new Pawn(0, 4, PlayingPiece.COLOR_BLACK);
		
//		Board board = new Board();
//		//check if first move is white
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("xForm: ");
		int xFrom = input.nextInt();
		System.out.println("yForm: ");
		int yFrom = input.nextInt();
		System.out.println("xTo: ");
		int xTo = input.nextInt();
		System.out.println("yTo: ");
		int yTo = input.nextInt();
		
		board.play(PlayingPiece.COLOR_WHITE, xFrom, yFrom, xTo, yTo);
		board.play(PlayingPiece.COLOR_BLACK, 7, 3, 3, 7);
//		board.play(PlayingPiece.COLOR_WHITE, xFrom, yFrom, xTo, yTo);
//		board.play(PlayingPiece.COLOR_BLACK, xFrom, yFrom, xTo, yTo);
	
	}

}
