package ai;

import logic.*;

import java.util.Random;

public class AI {
    public Field field;
    public AIBase action;
    public Random random;

    public AI(Field field){
        this.field = field;
        this.action = new AIRandom(this);
        this.random = new Random();
    }

    public int doShot(){
        return action.doShot();
    }

    public Field getField() {
        return field;
    }
}
