package swing;

import javax.swing.*;

public class GameLauncher {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        GameLogic logic = new GameLogic();
        GameView view = new GameView(logic);
        view.setVisible(true);
    }
}
