package gui.dice;

import java.awt.*;

public class SixDiceFace implements DiceFaceInterface{
    @Override
    public void drawDiceFace(int width, int height, Graphics g) {
        g.fillOval(width/2 - 15, height/2 + 10, 5, 5);
        g.fillOval(width/2 + 10, height/2 - 15, 5, 5);
        g.fillOval(width/2 - 15, height/2 - 15, 5, 5);
        g.fillOval(width/2 + 10, height/2 + 10, 5, 5);
        g.fillOval(width/2 - 15, height/2 - 5/2, 5, 5);
        g.fillOval(width/2 + 10, height/2 - 5/2, 5, 5);

    }
}
