
public class Pawn extends PlayingPiece {
	//we need to know if the figure has been moved or not
		private boolean hasBeenMoved;
		
		protected Pawn(int x, int y, int color) {
			super(x, y, color);
			this.hasBeenMoved = false;
		}

		//we call the move method of the parent
		//which returns if the move is made or not
		//if the figure is moved we change the hasBeenMoved field
		@Override
		public boolean move(int newX, int newY) {
			if(super.move(newX, newY)) {
				hasBeenMoved = true;
				return true;
			}
			return false;
		}
		
		//we allow to move 2 squares only if we hadn't moved before
		@Override
		protected boolean moveIsLegal(int newX, int newY) {
			if(super.moveIsLegal(newX, newY)) {
				if(hasBeenMoved) {
					return getX() == newX && Math.abs(getY() - newY) == 1;
				} else {
					return getX() == newX && Math.abs(getY() - newY) < 3;
				}
			}
			return false;
		}
}
