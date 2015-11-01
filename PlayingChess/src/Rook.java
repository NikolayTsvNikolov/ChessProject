
public class Rook extends PlayingPiece {

	
	private final String rookWhite = "\u2656";
	private final String rookBlack = "\u265C";
	
	
	public void getRook(int color) {
		if(color == 1) {
			System.out.println(rookWhite);
		} else {
			System.out.println(rookBlack);
		}
	}
	
	protected Rook(int x, int y, int color) {
		super(x, y, color);
		
	}

	
	@Override
	protected boolean moveIsLegal(int newX, int newY) {
		if(super.moveIsLegal(newX, newY)){
			if(getX() == newX) {
				return true;
			}
			if(getY() == newY) {
				return true;
			}
		}
		return false;
	}
	
	
}
