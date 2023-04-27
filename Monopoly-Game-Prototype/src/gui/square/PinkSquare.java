package gui.square;

import java.awt.*;

public class PinkSquare implements SquareTemplate{
    @Override
    public void paintColoredSquare(int width, int height, Graphics g) {
        g.drawRect(0, height - 20, width, 20);
        g.setColor(Color.PINK);
        g.fillRect(0, height - 20, width, 20);

    }
}
