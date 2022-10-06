package logic;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
    public final static int SHIP_WELL = 1;
    public final static int SHIP_INJURED = 2;
    public final static int SHIP_KILLED = 3;
    public int x;
    public int y;
    public int dx;
    public int dy;
    private int health;
    private int size;
    private int state;
    private Field field;
    private ArrayList<Cell> cells;
    private ArrayList<Cell> arounds;

    public Ship (Field field, int size){
        this.size = size;
        this.health = size;
        this.field = field;
        this.state = Ship.SHIP_WELL;

        do {
            this.getPlace();
        } while (!checkPlace());

        this.cells = new ArrayList<>();
        this.arounds = new ArrayList<>();
        this.setShip();

        getField().setLiveShips(getField().getLiveShips() + 1);
    }

    private void getPlace(){
        Random random = new Random();
        this.x = random.nextInt(getField().getWidth());
        this.y = random.nextInt(getField().getHeight());
        this.dx = 0;
        this.dy = 0;
        if (random.nextInt(2) == 1){
            this.dx = 1;
        }
        else{
            this.dy = 1;
        }
    }

    private boolean checkPlace(){
        return byPass(new PlaceShipCheck(this));
    }

    private void setShip(){
        byPass(new PlaceShipSet(this));
    }

    private boolean byPass(PlaceShip placeShip){
        int i, m, n;

        for (i = 0; i < size; i++) {
            n = x + i * dx;
            m = y + i * dy;
            if (!placeShip.setShip(m, n)){
                return false;
            }
            n = x + i * dx - dy;
            m = y + i * dy - dx;
            if (!placeShip.setAround(m, n)){
                return false;
            }
            n = x + i * dx + dy;
            m = y + i * dy + dx;
            if (!placeShip.setAround(m, n)){
                return false;
            }
        }

        for (i = -1; i < 2; i++) {
            n = x + i * dy - dx;
            m = y + i * dx - dy;
            if (!placeShip.setAround(m, n)){
                return false;
            }
            n = x + i * dy + (dx * size);
            m = y + i * dx + (dy * size);
            if (!placeShip.setAround(m, n)){
                return false;
            }
        }
        return true;
    }

    public int doShot(){
        if (health != 0){
            health--;
            if (health == 0){
                getField().setLiveShips(getField().getLiveShips() - 1);
                state = Ship.SHIP_KILLED;
                for (Cell cell : cells){
                    cell.setState(Cell.CELL_KILLED);
                }
                for (Cell cell : arounds){
                    cell.setState(Cell.CELL_MISSED);
                    cell.setMark(true);
                }
                return Field.SHOT_KILLED;
            }
            else {
                state = SHIP_INJURED;
            }
        }
        return Field.SHOT_INJURED;
    }

    public Field getField() {
        return field;
    }

    public ArrayList<Cell> getCells() {
        return cells;
    }

    public ArrayList<Cell> getArounds() {
        return arounds;
    }
}
