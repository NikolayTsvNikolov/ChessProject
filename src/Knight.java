
public class Knight extends PlayingPiece {

	protected Knight(int x, int y, int color) {
		super(x, y, color);
		
	}
	
	@Override
	protected boolean moveIsLegal(int newX, int newY) {
		if (super.moveIsLegal(newX, newY)) {
			if (Math.abs(getX() - newX) == 2 && Math.abs(getY() - newY) == 1) {
				return true;
			}
			if (Math.abs(getX() - newX) == 1 && Math.abs(getY() - newY) == 2) {
				return true;
			}
		}
		return false;

	}
}
