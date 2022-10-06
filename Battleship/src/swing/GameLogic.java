package swing;

import ai.AI;
import logic.Field;
import javax.swing.*;
import java.util.ArrayList;

public class GameLogic {
    private boolean currentMove; // false - ходит бот, true - ходит игрок
    private boolean enableShot;
    private ArrayList<PanelField> panelFields = new ArrayList<>();
    public Field playerField;
    public Field botField;
    public AI ai;

    public GameLogic() {
        playerField = new Field();
        botField = new Field();
        ai = new AI(playerField);
        newGame();
    }

    public void newGame() {
        playerField.setShips();
        botField.setShips();
        currentMove = true;
        enableShot = true;
        updatePanelFields();
    }

    public void doShot(int x, int y){
        if (currentMove && enableShot){
            if (botField.getCell(x, y).isMark()){
                return;
            }
            if (botField.doShot(x, y) == Field.SHOT_MISSED){
                currentMove = false;
            }
        }
        if (!currentMove && enableShot){
            while (ai.doShot() != Field.SHOT_MISSED);
            currentMove = true;
        }
        updatePanelFields();
        if (enableShot && botField.getLiveShips() == 0){
            enableShot = false;
            JOptionPane.showMessageDialog(null, "Вы выиграли!");
        }
        if (enableShot && playerField.getLiveShips() == 0){
            enableShot = false;
            JOptionPane.showMessageDialog(null, "Вы проиграли!");
        }
    }

    public void add(PanelField panelField){
        panelFields.add(panelField);
        panelField.update();
    }

    public void updatePanelFields() {
        for (PanelField panelField : panelFields) {
            panelField.update();
        }
    }
}
