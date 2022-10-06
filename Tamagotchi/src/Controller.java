import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    Logic logic;
    View view;

    public Controller(Logic logic, View view){
        this.logic = logic;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {//обработчик события (нажатия по кнопке)
        logic.action(e.getActionCommand());
        view.update();
    }
}
