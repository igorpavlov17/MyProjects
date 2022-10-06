import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Screen extends JPanel {
    private final Logic logic;
    private final View view;
    private final int height = 9;
    private final int width = 9;
    private final JLabel age = new JLabel();
    private final JLabel stage = new JLabel();
    private final JLabel name = new JLabel();
    private final JLabel pet = new JLabel();
    private final JLabel time = new JLabel();

    public final Color BACKGROUND_COLOR = new Color(160, 178, 129);
    public final Color PIXEL_COLOR = new Color(10, 12, 6);
    public final Color NONPIXEL_COLOR = new Color(156, 170, 125);

    public Screen(Logic logic, View view){
        this.logic = logic;
        this.view = view;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(BACKGROUND_COLOR);
        if (!logic.isInfo()){
            removeInfo();
            if (logic.getStatus() != Status.SLEEP) {
                drawMatrix(g, NONPIXEL_COLOR);
                drawPet(g, PIXEL_COLOR);
            } else {
                drawMatrix(g, PIXEL_COLOR);
                drawSleepPet(g, NONPIXEL_COLOR);
            }
        } else{
            drawMatrix(g, BACKGROUND_COLOR);
            initInfo();
        }
    }

    private void drawPet(Graphics g, Color color){
        drawPixel(13, 15, g, color);
        drawPixel(14, 15, g, color);
        drawPixel(15, 15, g, color);
        drawPixel(16, 15, g, color);
        drawPixel(17, 15, g, color);

        drawPixel(12, 16, g, color);
        drawPixel(18, 16, g, color);

        drawPixel(11, 17, g, color);
        drawPixel(12, 17, g, color);
        drawPixel(14, 17, g, color);
        drawPixel(15, 17, g, color);
        drawPixel(19, 17, g, color);

        drawPixel(9, 18, g, color);
        drawPixel(10, 18, g, color);
        drawPixel(15, 18, g, color);
        drawPixel(16, 18, g, color);
        drawPixel(19, 18, g, color);

        drawPixel(8, 19, g, color);
        drawPixel(14, 19, g, color);
        drawPixel(15, 19, g, color);
        drawPixel(16, 19, g, color);
        drawPixel(20, 19, g, color);

        drawPixel(8, 20, g, color);
        drawPixel(9, 20, g, color);
        drawPixel(10, 20, g, color);
        drawPixel(11, 20, g, color);
        drawPixel(20, 20, g, color);

        drawPixel(9, 21, g, color);
        drawPixel(20, 21, g, color);

        drawPixel(10, 22, g, color);
        drawPixel(11, 22, g, color);
        drawPixel(12, 22, g, color);
        drawPixel(13, 22, g, color);
        drawPixel(14, 22, g, color);
        drawPixel(19, 22, g, color);

        drawPixel(11, 23, g, color);
        drawPixel(12, 23, g, color);
        drawPixel(17, 23, g, color);
        drawPixel(19, 23, g, color);

        drawPixel(10, 24, g, color);
        drawPixel(12, 24, g, color);
        drawPixel(16, 24, g, color);
        drawPixel(20, 24, g, color);

        drawPixel(10, 25, g, color);
        drawPixel(11, 25, g, color);
        drawPixel(12, 25, g, color);
        drawPixel(16, 25, g, color);
        drawPixel(17, 25, g, color);
        drawPixel(18, 25, g, color);
        drawPixel(20, 25, g, color);

        drawPixel(12, 26, g, color);
        drawPixel(13, 26, g, color);
        drawPixel(18, 26, g, color);
        drawPixel(21, 26, g, color);

        drawPixel(10, 27, g, color);
        drawPixel(11, 27, g, color);
        drawPixel(14, 27, g, color);
        drawPixel(15, 27, g, color);
        drawPixel(16, 27, g, color);
        drawPixel(17, 27, g, color);
        drawPixel(21, 27, g, color);

        drawPixel(9, 28, g, color);
        drawPixel(11, 28, g, color);
        drawPixel(14, 28, g, color);
        drawPixel(16, 28, g, color);
        drawPixel(18, 28, g, color);
        drawPixel(20, 28, g, color);
        drawPixel(22, 28, g, color);

        drawPixel(9, 29, g, color);
        drawPixel(10, 29, g, color);
        drawPixel(11, 29, g, color);
        drawPixel(12, 29, g, color);
        drawPixel(13, 29, g, color);
        drawPixel(14, 29, g, color);
        drawPixel(16, 29, g, color);
        drawPixel(17, 29, g, color);
        drawPixel(18, 29, g, color);
        drawPixel(19, 29, g, color);
        drawPixel(20, 29, g, color);
        drawPixel(21, 29, g, color);
        drawPixel(22, 29, g, color);
    }

    private void drawSleepPet(Graphics g, Color color){
        drawPet(g, color);

        drawPixel(21, 10, g, color);
        drawPixel(22, 10, g, color);
        drawPixel(23, 10, g, color);
        drawPixel(24, 10, g, color);
        drawPixel(23, 11, g, color);
        drawPixel(22, 12, g, color);
        drawPixel(21, 13, g, color);
        drawPixel(22, 13, g, color);
        drawPixel(23, 13, g, color);
        drawPixel(24, 13, g, color);

        drawPixel(25, 5, g, color);
        drawPixel(26, 5, g, color);
        drawPixel(27, 5, g, color);
        drawPixel(28, 5, g, color);
        drawPixel(27, 6, g, color);
        drawPixel(26, 7, g, color);
        drawPixel(25, 8, g, color);
        drawPixel(26, 8, g, color);
        drawPixel(27, 8, g, color);
        drawPixel(28, 8, g, color);
    }

    private void drawMatrix(Graphics g, Color color){
        g.setColor(color);
        for (int i = 0; i < 32; i++) {//создание матрицы
            for (int j = 0; j < 32; j++) {
                g.fillRect(i * height, j * width, height - 1, width - 1);
            }
        }
    }

    private void drawPixel(int x, int y, Graphics g, Color color){
        g.setColor(color);
        g.fillRect(x * height, y * width, height - 1, width - 1);
    }

    private void initInfo(){
        name.setBounds(0, 0, 300, 15);
        name.setText("Имя: " + logic.getName());
        name.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(name);

        age.setBounds(0, 15, 300, 15);
        age.setText("Возраст: " + logic.age(logic.getAge()));
        age.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(age);

        stage.setBounds(0, 30, 300, 15);
        stage.setText("Стадия: " + logic.getStage());
        stage.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(stage);

        pet.setBounds(0, 45, 300, 15);
        pet.setText(view.getStatus());
        pet.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(pet);

        time.setBounds(0, 60, 300, 15);
        time.setText(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
        time.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        add(time);
    }

    private void removeInfo(){
        remove(name);
        remove(age);
        remove(stage);
        remove(pet);
        remove(time);
    }

    public int getScreenHeight(){
        return height;
    }

    public int getScreenWidth(){
        return width;
    }
}