
public class Queen extends PlayingPiece {

	
	private final String queenWhite = "\u2655";
	private final String queenBlack = "\u265B";
	
	
	public String getQueen(int color) {
		if(color == 1) {
			return queenWhite;
		} else {
			return queenBlack;
		}
	}
	
	@Override
	public String getCharacter() {
	
		return getQueen(getColor());
	}
	
	protected Queen(int x, int y, int color) {
		super(x, y, color);
		
	}
	
	
	@Override
	protected boolean moveIsLegal(int newX, int newY) {
		if(super.moveIsLegal(newX, newY)) {
			int deltaX = Math.abs(newX - getX());
			int deltaY = Math.abs(newY - getY());
			if(deltaX == deltaY) {
				return true;
			}
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
