
public class Queen extends PlayingPiece {

	protected Queen(int x, int y, int color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
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
