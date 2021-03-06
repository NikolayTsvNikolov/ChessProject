
public class Officer extends PlayingPiece{
	
	private static String officerBlack = "\u265D";
	private static String officerWhite = "\u2657";
	
	
	protected Officer(int x, int y, int color) {
		super(x, y, color);
	}

	public String getOfficer(int color) {
		if (color == 1) {
			return officerWhite;
		} else {
			return officerBlack;
		}
		
	}
	
	@Override
	public String getCharacter() {
		return getOfficer(getColor());
	}
	
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
