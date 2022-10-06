package swing;

import logic.Cell;
import logic.Field;
import javax.swing.*;
import java.awt.*;

public abstract class PanelField extends JPanel {
    private Field field;
    private boolean isBot;

    public PanelField(Field field, boolean isBot){
        this.field = field;
        this.isBot = isBot;
    }

    public Field getField(){
        return field;
    }

    protected abstract Color getColor(int state);

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < field.getWidth() + 1; i++) {
            g.drawLine(i * (getWidth() / field.getWidth()), 0, i * (getWidth() / field.getWidth()), (getHeight() / field.getHeight()) * field.getHeight());
        }
        for (int i = 0; i < field.getHeight() + 1; i++) {
            g.drawLine(0, i * (getHeight() / field.getHeight()), (getWidth() / field.getWidth()) * field.getWidth(), i * (getHeight() / field.getHeight()));
        }
        for (int i = 0; i < field.getWidth(); i++) {
            for (int j = 0; j < field.getHeight(); j++) {
                int state = field.getCell(j, i).getState();
                g.setColor(getColor(state));
                if (state == Cell.CELL_MISSED){
                    g.fillRect(j * (getHeight() / field.getHeight()) + ((getHeight() / field.getHeight()) / 2) - 1, i * (getWidth() / field.getWidth()) + ((getWidth() / field.getWidth()) / 2) - 1, 4, 4);
                }
                else {
                    g.fillRect(j * (getHeight() / field.getHeight()) + 1, i * (getWidth() / field.getWidth()) + 1, (getHeight() / field.getHeight()) - 1, (getWidth() / field.getWidth()) - 1);
                }
            }
        }
    }

    public void update() {
        this.repaint();
    }
}
