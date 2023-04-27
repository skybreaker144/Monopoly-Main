package gui.square;

import static java.util.Objects.isNull;

public class SquareFactory {

    public SquareTemplate getSquare(String color){
        if(isNull(color)){
            return null;
        }

        if(color.equals("BLUE")){
            return new BlueSquare();
        } else if(color.equals("GREEN")){
            return new GreenSquare();
        } else if(color.equals("ORANGE")){
            return new OrangeSquare();
        } else if(color.equals("PINK")){
            return new PinkSquare();
        }
        return null;
    }
}
