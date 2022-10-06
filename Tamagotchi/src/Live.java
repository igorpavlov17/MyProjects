import javax.swing.*;

public class Live {
    Logic logic;
    View view;

    public Live(Logic logic, View view){
        this.logic = logic;
        this.view = view;
        live();
    }

    public void live() {
        while (logic.getStatus() != Status.DEAD) {
            timer.start();
        }
    }

    Timer timer = new Timer(1000, e -> {//таймер (каждую секунду изменяет параметры питомца)
        logic.live();
        view.update();
//        System.out.println("Энергия " + logic.getEnergy());
//        System.out.println("Гигиена " + logic.getHygiene());
//        System.out.println("Здоровье " + logic.getHealth());
//        System.out.println("Счастье " + logic.getFun());
//        System.out.println("Голод " + logic.getHunger());
//        System.out.println("Статус " + logic.getStatus());
//        System.out.println("Возраст " + logic.getAge());
//        System.out.println("Счастье " + logic.getHappiness());
//        System.out.println("Болен " + logic.getSick());
    });
}
