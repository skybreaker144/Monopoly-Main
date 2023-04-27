package gui.dice;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Dice extends JPanel {

	Random rnd = new Random();
	int faceValue = 1;

	public Dice(int xCoord, int yCoord, int width, int height) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(xCoord, yCoord, width, height);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		DiceContext dice = null;
		if (faceValue == 1) {
			dice = new DiceContext(new OneFaceDice());
			dice.executeStrategy(getWidth(), getHeight(), g);
		} else if (faceValue == 2) {
			dice = new DiceContext(new TwoFaceDice());
			dice.executeStrategy(getWidth(), getHeight(), g);
		} else if (faceValue == 3) {
			dice = new DiceContext(new ThreeFaceDice());
			dice.executeStrategy(getWidth(), getHeight(), g);
		} else if (faceValue == 4) {
			dice = new DiceContext(new FourDiceFace());
			dice.executeStrategy(getWidth(), getHeight(), g);
		} else if (faceValue == 5) {
			dice = new DiceContext(new FiveDiceFace());
			dice.executeStrategy(getWidth(), getHeight(), g);
		} else {
			dice = new DiceContext(new SixDiceFace());
			dice.executeStrategy(getWidth(), getHeight(), g);
		}
	}

	public void rollDice() {
		faceValue = rnd.nextInt(6) + 1;
		repaint();
	}

	public int getFaceValue() {
		return faceValue;
	}

	// public Dice(int xCoord, int yCoord, int width, int height, String
	// labelString) {
	// setBorder(new LineBorder(new Color(0, 0, 0)));
	// setBounds(xCoord, yCoord, width, height);

	// }

}
