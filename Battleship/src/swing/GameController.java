package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GameController implements ActionListener {
    public GameLogic logic;
    public GameView view;

    public GameController(GameLogic logic, GameView view){
        this.logic = logic;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("New game")){
            logic.newGame();
        }
        if (s.equals("Exit")){
            System.exit(0);
        }
    }

    public void mousePressed(MouseEvent e) {
        PanelField panelField = view.panelFieldBot;
        int x = e.getX() / (panelField.getWidth() / panelField.getField().getWidth());
        int y = e.getY() / (panelField.getHeight() / panelField.getField().getHeight());
        if (panelField.getField().isBound(x, y)) {
            logic.doShot(x, y);
        }
    }
}
