package logic;

public class Cell {
    public final static int CELL_WATER = 1;
    public final static int CELL_AROUND = 2;
    public final static int CELL_WELL = 3;
    public final static int CELL_INJURED = 4;
    public final static int CELL_KILLED = 5;
    public final static int CELL_MISSED = 6;
    public int x;
    public int y;
    private int state;
    private boolean mark;
    private Ship ship;

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
        this.state = CELL_WATER;
        this.mark = false;
    }

    public int doShot(){
        mark = true;
        if (state == CELL_WELL){
            state = CELL_INJURED;
            return getShip().doShot();
        }
        else{
            if (state == CELL_WATER){
                state = CELL_MISSED;
            }
        }
        return Field.SHOT_MISSED;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
