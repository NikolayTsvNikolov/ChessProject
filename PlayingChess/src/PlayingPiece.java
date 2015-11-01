public class PlayingPiece {

	public static final int COLOR_WHITE = 1;
	public static final int COLOR_BLACK = 2;

	// fields
	private int x;
	private int y;
	private int color;
	private boolean isAlive;

	// constructor
	protected PlayingPiece(int x, int y, int color) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.isAlive = true;
	}

	
	public boolean move(int newX, int newY) {
		if (moveIsLegal(newX, newY)) {
			setX(newX);
			setY(newY);
			return true;
		}
		return false;
	}

		protected boolean moveIsLegal(int newX, int newY) {
		if (newX < 0 || newX > 7)
			return false;
		if (newY < 0 || newY > 7)
			return false;
		return true;
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getColor() {
		return color;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

}
