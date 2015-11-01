import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;


public class Display extends JFrame implements MouseListener, MouseMotionListener{
	
	JLayeredPane layeredPane;
    JPanel chessBoard;
    JLabel chessPiece;
    int xAdjustment;
    int yAdjustment;
    int startX;
    int startY;
    int initialX;
    int initialY;
    JPanel panels;
    JLabel pieces;	

	 public Display() {
	        Dimension boardSize = new Dimension(600, 600);

	        //  Use a Layered Pane for this application
	        layeredPane = new JLayeredPane();
	        getContentPane().add(layeredPane);
	        layeredPane.setPreferredSize(boardSize);
	        layeredPane.addMouseListener(this);
	        layeredPane.addMouseMotionListener(this);

	        //Add a chess board to the Layered Pane
	        chessBoard = new JPanel();
	        layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
	        chessBoard.setLayout(new GridLayout(8, 8));
	        chessBoard.setPreferredSize(boardSize);
	        chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);
	        
	        for (int i = 0; i < 64; i++) {
	            JPanel square = new JPanel(new BorderLayout());
	            chessBoard.add(square);

	            int row = (i / 8) % 2;
	            if (row == 0) {
	                square.setBackground(i % 2 == 0 ? Color.white : Color.gray);
	            } else {
	                square.setBackground(i % 2 == 0 ? Color.gray : Color.white);
	            }
	        }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
