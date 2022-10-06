import javax.swing.*;

public class Logic {
    private Status status;
    private double hunger;
    private double hygiene;
    private double fun;
    private double health;
    private double energy;
    private double happiness;
    private long age;
    private int sick;
    private boolean info;
    private String stage;
    private String name;

    public Logic(double hunger, double hygiene, double fun, double health, double energy){
        this.hunger = hunger;
        this.hygiene = hygiene;
        this.fun = fun;
        this.health = health;
        this.energy = energy;
        setStatus();
    }

    public void setStatus(){//изменение статуса
        if (status != Status.DEAD) {
            if (status != Status.SLEEP) {
                if ((int) health < 3) {
                    status = Status.SICK;
                } else if ((int) hunger < 3) {
                    status = Status.HUNGRY;
                } else if ((int) hygiene < 3) {
                    status = Status.DIRTY;
                } else if ((int) energy < 3) {
                    status = Status.SLEEPY;
                } else if ((int) fun < 3) {
                    status = Status.SAD;
                } else {
                    status = Status.HAPPY;
                }
            }
        }
    }

    public void action(String command){//действие по нажатию кнопки
        if (status != Status.DEAD) {
            switch (command) {
                case "eat" :
                    if (hunger < 10 && status != Status.SLEEP) {
                        hunger = hunger + 2;
                        energy = energy + 0.5;
                        if (hunger > 10) hunger = 10.5;
                    }
                    break;
                case "wash" :
                    if (hygiene < 10 && status != Status.SLEEP) {
                        hygiene = 10.5;
                    }
                    break;
                case "play" :
                    if (fun < 10 && energy > 1 && status != Status.SLEEP) {
                        fun = fun + 2;
                        energy = energy - 1;
                        if (fun > 10) fun = 10.5;
                    }
                    break;
                case "heal" :
                    if (health < 10 && status != Status.SLEEP) {
                        health = health + 5;
                        fun = fun - 2;
                        if (fun < 0) fun = 0;
                        if (health > 10) health = 10.5;
                    }
                    break;
                case "sleep" :
                    if (status != Status.SLEEP) {
                        status = Status.SLEEP;
                    } else status = Status.HAPPY;
                    break;
                case "info" : info = !info; break;
            }
        }
    }

    public void live(){//изменение параметров каждую секунду
        if (status != Status.SLEEP) {
            if (hunger > 0) hunger = hunger - 0.0001;
            if (hygiene > 0) hygiene = hygiene - 0.00008;
            if (fun > 0) fun = fun - 0.00008;
            if (health > 0) {
                if (hunger < 2 || hygiene < 1){
                    health = health - 0.0001;
                } else health = health - 0.000001;
            }
            if (energy > 0) energy = energy - 0.0001;
        } else {
            if (hunger > 0) hunger = hunger - 0.0002;
            if (energy < 10.5) energy = energy + 0.0003;
            if (hygiene > 0) hygiene = hygiene - 0.0001;
            if (health < 10.5) health = health + 0.00002;
            if (fun > 0) fun = fun - 0.0001;
        }
        if (health < 1){
            sick++;
            if (sick == 86400){
                status = Status.DEAD;
            }
        } else sick = 0;
        happiness = (hunger + hygiene + fun + health + energy) / 5;
        age++;
    }

    public String age(long age){//установить возраст
        long days = age / 86400;
        long hours = (age % 86400) / 3600;
        long minutes = (age % 3600) / 60;
        setStage(days);
        return days + "д " + hours + "ч " + minutes + "мин ";
    }

    public String getName() {
        return name;
    }

    public void setName() {//ввести имя
        while (name == null || name.equals("")) {
            this.name = JOptionPane.showInputDialog("Введите имя питомца: ");
            if (name == null) System.exit(0);
            if (name.equals("")) JOptionPane.showMessageDialog(null, "Вы не ввели имя!");
        }
    }

    public void setStage(long days) {
        if (days < 3) stage = "Младенец";
        if (days > 2 && days < 11) stage = "Ребенок";
        if (days > 10 && days < 21) stage = "Подросток";
        if (days > 20 && days < 80) stage = "Взрослый";
        if (days > 79) stage = "Старый";
    }

    public Status getStatus() {
        return status;
    }

    public int getSick() {
        return sick;
    }

    public double getHunger() {
        return hunger;
    }

    public double getHygiene() {
        return hygiene;
    }

    public double getEnergy() {
        return energy;
    }

    public double getFun() {
        return fun;
    }

    public double getHealth() {
        return health;
    }

    public double getHappiness() {
        return happiness;
    }

    public String getStage() {
        return stage;
    }

    public long getAge() {
        return age;
    }

    public boolean isInfo() {
        return info;
    }
}