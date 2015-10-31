
public class Officer extends PlayingPiece{
	
	protected Officer(int x, int y, int color) {
		super(x, y, color);
	}

	//we need to add logic to the initial moveIsLegal method
	//we check if we are on the board by calling moveIsLegal of the parent
	//and then add logic for the officer figure
	@Override
	protected boolean moveIsLegal(int newX, int newY) {
		if(super.moveIsLegal(newX, newY)) {
			int deltaX = Math.abs(newX - getX());
			int deltaY = Math.abs(newY - getY());
			if(deltaX == deltaY) return true;
		}
		return false;
	}

}
