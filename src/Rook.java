
public class Rook extends PlayingPiece {

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
