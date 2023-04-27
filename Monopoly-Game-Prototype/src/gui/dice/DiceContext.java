package gui.dice;

import java.awt.*;

public class DiceContext {
    private DiceFaceInterface diceFace;

    public DiceContext(DiceFaceInterface strategy) {
        this.diceFace = strategy;
    }

    public void executeStrategy(int width, int height, Graphics g) {
        diceFace.drawDiceFace(width, height, g);
    }
}
