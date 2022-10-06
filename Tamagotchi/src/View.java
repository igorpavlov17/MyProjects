import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private final Logic logic;
    private final Controller controller;
    private final Screen screen;
    private final JButton eat = new JButton();
    private final JButton wash = new JButton();
    private final JButton play = new JButton();
    private final JButton heal = new JButton();
    private final JButton sleep = new JButton();
    private final JButton info = new JButton();
    private final JLabel hunger = new JLabel();
    private final JLabel hygiene = new JLabel();
    private final JLabel energy = new JLabel();
    private final JLabel fun = new JLabel();
    private final JLabel health = new JLabel();
    private final JLabel happiness = new JLabel();
    private String status;

    public final Color BACKGROUND_COLOR = new Color(160, 178, 129);
    public final Color PIXEL_COLOR = new Color(10, 12, 6);
    public final Color NONPIXEL_COLOR = new Color(156, 170, 125);
    private final String path = "F:\\Programming\\Projects\\Java\\Tamagotchi\\res\\";

    public View(Logic logic){
        this.logic = logic;
        this.controller = new Controller(logic, this);
        this.screen = new Screen(logic, this);
        setStatus();
        logic.setName();
        initFrame();
        buildUI();
        getContentPane().setBackground(BACKGROUND_COLOR);
        attachController();
    }

    private void initFrame(){//установить окно
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Тамагочи");
        setLayout(null);
        setSize(343, 435);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(path + "icon.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
    }

    private void setStatus() {//отобразить статус
        switch (logic.getStatus()){
            case HAPPY : status = "Питомец счастлив"; break;
            case SAD : status = "Питомец грустный"; break;
            case HUNGRY : status = "Питомец голодный"; break;
            case DIRTY : status = "Питомец грязный"; break;
            case SLEEPY : status = "Питомец хочет спать"; break;
            case SICK : status = "Питомец заболел"; break;
            case SLEEP : status = "Питомец спит"; break;
            case DEAD : status = "Питомец мертв"; break;
        }
    }

    private void buildUI(){//построить интерфейс
        initLabels();
        initButtons();
        initScreen();
    }

    private void initScreen(){
        screen.setBounds(20, 60, screen.getScreenHeight() * 32, screen.getScreenWidth() * 32);
        add(screen);
    }

    private void initLabels(){//установить лейблы
        hunger.setBounds(10, 10, 300, 30);
        hunger.setText("<html>HUNGER<br>" + (int) logic.getHunger() + "/10</html>");
        hunger.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(hunger);

        hygiene.setBounds(60, 10, 300, 30);
        hygiene.setText("<html>HYGIENE<br>" + (int) logic.getHygiene() + "/10</html>");
        hygiene.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(hygiene);

        fun.setBounds(110, 10, 300, 30);
        fun.setText("<html>FUN<br>" + (int) logic.getFun() + "/10</html>");
        fun.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(fun);

        health.setBounds(160, 10, 300, 30);
        health.setText("<html>HEALTH<br>" + (int) logic.getHealth() + "/10</html>");
        health.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(health);

        energy.setBounds(210, 10, 300, 30);
        energy.setText("<html>ENERGY<br>" + (int) logic.getEnergy() + "/10</html>");
        energy.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(energy);

        happiness.setBounds(260, 10, 300, 30);
        happiness.setText("<html>HAPPINESS<br>" + (int) logic.getHappiness() + "/10</html>");
        happiness.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(happiness);
    }

    private void initButtons(){//установить кнопки
        eat.setBounds(10, 360, 25, 25);
        eat.setActionCommand("eat");
        eat.setIcon(new ImageIcon(new ImageIcon(path + "eat.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        eat.setRolloverIcon(new ImageIcon(new ImageIcon(path + "eatrollover.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        eat.setBorder(BorderFactory.createEmptyBorder());
        eat.setContentAreaFilled(false);
        add(eat);

        wash.setBounds(66, 360, 25, 25);
        wash.setActionCommand("wash");
        wash.setIcon(new ImageIcon(new ImageIcon(path + "wash.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        wash.setRolloverIcon(new ImageIcon(new ImageIcon(path + "washrollover.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        wash.setBorder(BorderFactory.createEmptyBorder());
        wash.setContentAreaFilled(false);
        add(wash);

        play.setBounds(122, 360, 25, 25);
        play.setActionCommand("play");
        play.setIcon(new ImageIcon(new ImageIcon(path + "play.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        play.setRolloverIcon(new ImageIcon(new ImageIcon(path + "playrollover.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        play.setBorder(BorderFactory.createEmptyBorder());
        play.setContentAreaFilled(false);
        add(play);

        heal.setBounds(178, 360, 25, 25);
        heal.setActionCommand("heal");
        heal.setIcon(new ImageIcon(new ImageIcon(path + "heal.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        heal.setRolloverIcon(new ImageIcon(new ImageIcon(path + "healrollover.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        heal.setBorder(BorderFactory.createEmptyBorder());
        heal.setContentAreaFilled(false);
        add(heal);

        sleep.setBounds(234, 360, 25, 25);
        sleep.setActionCommand("sleep");
        sleep.setIcon(new ImageIcon(new ImageIcon(path + "sleep.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        sleep.setRolloverIcon(new ImageIcon(new ImageIcon(path + "sleeprollover.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        sleep.setBorder(BorderFactory.createEmptyBorder());
        sleep.setContentAreaFilled(false);
        add(sleep);

        info.setBounds(290, 360, 25, 25);
        info.setActionCommand("info");
        info.setIcon(new ImageIcon(new ImageIcon(path + "info.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        info.setRolloverIcon(new ImageIcon(new ImageIcon(path + "inforollover.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        info.setBorder(BorderFactory.createEmptyBorder());
        info.setContentAreaFilled(false);
        add(info);
    }

    private void attachController(){//прикрепить слушатели к кнопкам
        eat.addActionListener(controller);
        wash.addActionListener(controller);
        play.addActionListener(controller);
        heal.addActionListener(controller);
        sleep.addActionListener(controller);
        info.addActionListener(controller);
    }

    public void update(){//обновить окно
        logic.setStatus();
        setStatus();
        initLabels();
        screen.repaint();
    }

    public String getStatus() {
        return status;
    }
}
