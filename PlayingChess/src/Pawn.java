
public class Pawn extends PlayingPiece {
		private boolean hasBeenMoved;
	
		private final String pawnWhite = "\u2659";
		private final String pawnBlack = "\u265F";
		
		
		
		public String getPawn(int color) {
			if(color == 1) {
				return pawnWhite;
			} else {
				return pawnBlack;
			}
		}
		
		@Override
		public String getCharacter() {
		
			return getPawn(getColor());
		}
		
		
		public Pawn(int x, int y, int color) {
			super(x, y, color);
			this.hasBeenMoved = false;
		}

	
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
					return getY() == newY && Math.abs(getX() - newX) == 1;
				} else {
					return getY() == newY && Math.abs(getX() - newX) < 3;
				}
			}
			return false;
		}
}
