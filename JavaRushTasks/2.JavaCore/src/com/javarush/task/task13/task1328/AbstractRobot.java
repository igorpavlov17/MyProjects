package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable{
    private static int hitCount;
    private static int defendCount;

    public BodyPart attack(){
        BodyPart attackedBodyPart = null;
        hitCount = (int) (Math.random() * 4) + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount >= 4) {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense(){
        BodyPart defendedBodyPart = null;
        defendCount = (int) (Math.random() * 4) + 1;

        if (defendCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (defendCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (defendCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else if (defendCount >= 4) {
            defendCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }

    public abstract Object getName();
}
