package gui.square;

import java.awt.*;

public class OrangeSquare implements SquareTemplate {
    @Override
    public void paintColoredSquare(int width, int height, Graphics g) {
        g.drawRect(0, height - 20, width, 20);
        g.setColor(Color.ORANGE);
        g.fillRect(0, height - 20, width, 20);

    }
}
