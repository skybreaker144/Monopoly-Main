package gui.dice;

import java.awt.*;

public class OneFaceDice implements DiceFaceInterface{

    @Override
    public void drawDiceFace(int width, int height, Graphics g) {
        g.fillOval(width/2 - 5/2, height/2 - 5/2, 5, 5);
    }
}
