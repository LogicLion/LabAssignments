/**************************************************************
* TicTacToe.java
* Dean & Dean
*
* This program implements the game of tic-tac-toe.
* When the first blank button is clicked, its label changes
* to an X. Subsequent clicked blank buttons change their labels
* to O and X in alternating sequence.
**************************************************************/

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TicTacToe extends JPanel
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private boolean xTurn = true; // keeps track of whether
                                // it's X's turn or O's turn

  //***********************************************************

  public TicTacToe()
  {
  //  setName("Tic-Tac-Toe");
    setSize(200, 220);
    //setDefaultCloseOperation(EXIT_ON_CLOSE);
    createContents();
    setVisible(true);
  } // end TicTacToe constructor

  //***********************************************************

  // Create components and add to window.

  private void createContents()
  {
    JButton button; // re-instantiate this button and use
                    // to fill entire board
    setLayout(new GridLayout(3, 3));
    for (int i=0; i<3; i++)
    {
      for (int j=0; j<3; j++)
      {
        button = new JButton();
        button.addActionListener(new Listener());
        add(button);
      } // end for j
    } // end for i
  } // end createContents

  //***********************************************************

  // If user clicks a button, change its label to "X" or "O".

  private class Listener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      JButton btn = (JButton) e.getSource();
      if (btn.getText().isEmpty())
      {
        btn.setText(xTurn ? "X" : "O");
        xTurn = !xTurn;
      }
    } // end actionPerformed
  } // end class Listener

  //***********************************************************

  
} // end class TicTacToe