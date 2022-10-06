package swing;

import logic.*;
import java.awt.*;

public class PanelFieldPlayer extends PanelField{
    public PanelFieldPlayer(Field field) {
        super(field, false);
    }

    @Override
    protected Color getColor(int state) {
        switch (state){
            case Cell.CELL_WATER: return new Color(147, 219, 255);
            case Cell.CELL_AROUND: return Color.white;
            case Cell.CELL_WELL: return Color.blue;
            case Cell.CELL_INJURED: return Color.red;
            case Cell.CELL_KILLED: return Color.gray;
            case Cell.CELL_MISSED: return Color.black;
        }
        return Color.white;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}


