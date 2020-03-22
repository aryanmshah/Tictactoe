import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main implements ActionListener{
	public static boolean playerTurn=true;
	public static boolean playerWon = false;
	public static boolean computerWon =false;
	public static tictactoe board = new tictactoe();
	
	JButton buttongo;

public static void main(String[] args) {

Main main=new Main();





	
	
	
	if(board.isVisible() ==false) {
		
		board.setVisible(false);
		
	}
	
}

public Main(){
	JFrame frame=new JFrame("Tic tac toe");
	JPanel panel=new JPanel();
	JLabel label=new JLabel("Player 1 name:");
	JTextField field= new JTextField(35);
	JLabel label2=new JLabel("Player 2 name:" );
 
	JTextField field2= new JTextField(35);
	buttongo=new JButton();
	buttongo.setText("PLAY!");
	buttongo.addActionListener(this);

	frame.setVisible(true);
	frame.setResizable(false);
	frame.setSize(500, 500);
	frame.add(panel);
	panel.add(label);
	panel.add(field);
	
	panel.add(label2);
	panel.add(field2);
panel.add(buttongo);


	
	
}


public static void checkforwin() {

	
	if(board.button1.getText().equals("X")) {
		if(board.button4.getText().equals("X")) {
			if(board.button7.getText().equals("X")) {
				playerWon= true;
				computerWon=false;
				JOptionPane.showConfirmDialog(null, "Player 1 won");		
			} 
		}
	}
	
if(board.button1.getText().equals("X")) {
if(board.button5.getText().equals("X")) {
if(board.button9.getText().equals("X")) {
	playerWon= true;
	computerWon=false;
	JOptionPane.showConfirmDialog(null, "Player 1 won");	
	}
	}
	}


if(board.button1.getText().equals("X")) {
if(board.button2.getText().equals("X")) {
if(board.button3.getText().equals("X")) {
playerWon= true;
computerWon=false;
JOptionPane.showConfirmDialog(null, "Player 1 won");	
}
}
}



if(board.button3.getText().equals("X")) {
if(board.button5.getText().equals("X")) {
if(board.button7.getText().equals("X")) {
playerWon= true;
computerWon=false;
JOptionPane.showConfirmDialog(null, "Player 1 won");	
}
}
}


if(board.button3.getText().equals("X")) {
if(board.button6.getText().equals("X")) {
if(board.button9.getText().equals("X")) {
playerWon= true;
computerWon=false;
JOptionPane.showConfirmDialog(null, "Player 1 won");	
}
}
}


if(board.button7.getText().equals("X")) {
if(board.button8.getText().equals("X")) {
if(board.button9.getText().equals("X")) {
playerWon= true;
computerWon=false;
JOptionPane.showConfirmDialog(null, "Player 1 won");	
}
}
}


if(board.button4.getText().equals("X")) {
if(board.button5.getText().equals("X")) {
if(board.button6.getText().equals("X")) {
playerWon= true;
computerWon=false;
JOptionPane.showConfirmDialog(null, "Player 1 won");	
}
}
}


if(board.button2.getText().equals("X")) {
if(board.button5.getText().equals("X")) {
if(board.button8.getText().equals("X")) {
playerWon= true;
computerWon=false;
JOptionPane.showConfirmDialog(null, "Player 1 won");	
}
}
}

if(board.button1.getText().equals("O")) {
	if(board.button4.getText().equals("O")) {
		if(board.button7.getText().equals("O")) {
			playerWon=false;
			computerWon=true;
			JOptionPane.showConfirmDialog(null, "Player 2 won");		
		} 
	}
}

if(board.button1.getText().equals("O")) {
if(board.button5.getText().equals("O")) {
if(board.button9.getText().equals("O")) {
playerWon=false;
computerWon=true;
JOptionPane.showConfirmDialog(null, "Player 2 won");	
}
}
}


if(board.button1.getText().equals("O")) {
if(board.button2.getText().equals("O")) {
if(board.button3.getText().equals("O")) {
playerWon=false;
computerWon=true;
JOptionPane.showConfirmDialog(null, "Player 2 won");	
}
}
}



if(board.button3.getText().equals("O")) {
if(board.button5.getText().equals("O")) {
if(board.button7.getText().equals("O")) {
playerWon=false;
computerWon=true;
JOptionPane.showConfirmDialog(null, "Player 2 won");	
}
}
}


if(board.button3.getText().equals("O")) {
if(board.button6.getText().equals("O")) {
if(board.button9.getText().equals("O")) {
playerWon=false;
computerWon=true;
JOptionPane.showConfirmDialog(null, "Player 2 won");	
}
}
}


if(board.button7.getText().equals("O")) {
if(board.button8.getText().equals("O")) {
if(board.button9.getText().equals("O")) {
playerWon=false;
computerWon=true;
JOptionPane.showConfirmDialog(null, "Player 2 won");	
}
}
}


if(board.button4.getText().equals("O")) {
if(board.button5.getText().equals("O")) {
if(board.button6.getText().equals("O")) {
playerWon=false;
computerWon=true;
JOptionPane.showConfirmDialog(null, "Player 2 won");	
}
}
}


if(board.button2.getText().equals("O")) {
if(board.button5.getText().equals("O")) {
if(board.button8.getText().equals("O")) {
playerWon=false;
computerWon=true;
JOptionPane.showConfirmDialog(null, "Player 2 won");	
}
}
}

}

@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == buttongo) {
		if(board.isVisible() ==false) {
			
			board.setVisible(true);
			
		}
		else {
			System.out.println("K");
			
		}
	}
	
}
}
