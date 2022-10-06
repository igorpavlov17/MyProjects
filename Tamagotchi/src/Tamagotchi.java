import javax.swing.*;

public class Tamagotchi extends JFrame {
    public static void main(String[] args){
        Logic logic = new Logic(3, 3, 3, 10.5, 6);//создание объекта логики
        View view = new View(logic);//создание объекта окна
        view.setVisible(true);//показать окно
        new Live(logic, view);//создание объекта жизни
    }
}
