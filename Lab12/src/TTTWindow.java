import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TTTWindow extends JFrame {
	
	TicTacToe game = new TicTacToe();;
	JPanel buttonBoard  = new JPanel(new GridLayout(2,1));
	
	private JButton newGame;
	private JButton quit;
	
	public TTTWindow(){
		
		setTitle("Tic Tac Toe");
		setSize(600,200);
		setLayout(new BorderLayout());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		createContents();
		setVisible(true);
	}
	
	private void createContents()
	  {
		 
		
		this.newGame = new JButton("New Game");
		this.quit = new JButton("Quit");
		
		buttonBoard.add(newGame);
		buttonBoard.add(quit);
		newGame.addActionListener(new Listener());
		quit.addActionListener(new Listener());

		add(game, BorderLayout.CENTER);
		add(buttonBoard, BorderLayout.EAST);
		
	  }	
	
	private class Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == newGame){
				remove(game);
				add(game = new TicTacToe(), BorderLayout.CENTER);
				validate();
			}else{
				System.exit(0);
			} 
		}
	}

	
	
	public static void main(String[] args)
	  {
	    new TTTWindow();
	  }

}
