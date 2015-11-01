
public class King extends PlayingPiece {
	
	private boolean hasBeenMoved;
	private String kingWhite = "\u2654";
	private String kingBlack = "\u265A";
	
	public void getKing(int color) {
		if(color == 1) {
			System.out.println(kingWhite);
		} else {
			System.out.println(kingBlack);
		}
	}
	
	protected King(int x, int y, int color) {
		super(x, y, color);
		this.hasBeenMoved = false;
	}
	
	@Override
	public boolean move(int newX, int newY) {
		if(super.move(newX, newY)) {
			this.hasBeenMoved = true;
			return true;
		} else {
			return false;
		}
	}
	@Override
	protected boolean moveIsLegal(int newX, int newY) {
		if(super.move(newX, newY)) {
			if (hasBeenMoved){
				return  Math.abs(getX() - newX) == 1 || Math.abs(getY() - newY) == 1
						|| Math.abs(getX() - newX) == 1 && Math.abs(getY() - newY) == 1;
			} else {
				return false;
			}
			
		}
		return false;
	}
}
