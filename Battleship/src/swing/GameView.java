package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameView extends JFrame {
    private GameLogic logic;
    private GameController controller;
    private JMenuItem jMenuNewGame;
    private JMenuItem jMenuExit;
    public PanelFieldPlayer panelFieldPlayer;
    public PanelFieldBot panelFieldBot;

    public GameView(GameLogic logic) {
        this.logic = logic;
        buildUI();
        this.logic.add(panelFieldBot);
        this.logic.add(panelFieldPlayer);
        this.controller = new GameController(logic, this);
        attachController();
    }

    private void buildUI(){
        this.setTitle("Battleship");
        this.setResizable(false);
        this.setBounds(460, 290, 580, 350);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((dimension.width-this.getWidth())/2, (dimension.height - this.getHeight())/2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        panelFieldPlayer = new PanelFieldPlayer(logic.playerField);
        panelFieldPlayer.setBounds(25, 45, 251, 251);
        this.getContentPane().add(panelFieldPlayer);

        panelFieldBot = new PanelFieldBot(logic.botField);
        panelFieldBot.setBounds(300, 45, 251, 251);
        this.getContentPane().add(panelFieldBot);

        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setBounds(0, 0, 577, 20);
        this.getContentPane().add(jMenuBar);

        JMenu menuGame = new JMenu("Game");
        jMenuBar.add(menuGame);

        jMenuNewGame = new JMenuItem("New game");
        menuGame.add(jMenuNewGame);

        jMenuExit = new JMenuItem("Exit");
        menuGame.add(jMenuExit);
    }

    private void attachController(){
        jMenuNewGame.addActionListener(controller);
        jMenuExit.addActionListener(controller);
        panelFieldBot.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                controller.mousePressed(e);
            }
        });
    }
}
