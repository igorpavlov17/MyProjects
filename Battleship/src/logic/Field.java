package logic;

import java.util.ArrayList;

public class Field {
    public final static int SHOT_MISSED = 1;
    public final static int SHOT_INJURED = 2;
    public final static int SHOT_KILLED = 3;
    private Cell[][] cells;
    private ArrayList<Ship> ships;
    private int width = 10;
    private int height = 10;
    private int liveShips;

    public void setShips(){
        setLiveShips(0);
        cells = new Cell[getWidth()][getHeight()];
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                cells[j][i] = new Cell(j, i);
            }
        }
        ships = new ArrayList<Ship>();
        for (int i = 4; i > 0; i--) {
            for (int j = (5 - i); j > 0; j--) {
                Ship ship = new Ship(this, i);
                ships.add(ship);
            }
        }
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                Cell cell = cells[j][i];
                if (cell.getState() == Cell.CELL_AROUND){
                    cell.setState(Cell.CELL_WATER);
                }
            }
        }
    }

    public int doShot(int x, int y){
        int shot = getCell(x, y).doShot();
        return shot;
    }

    public boolean isBound(int x, int y){
        return !((x < 0) || (x > (getWidth() - 1)) || (y < 0) || (y > (getHeight() - 1)));
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLiveShips() {
        return liveShips;
    }

    public void setLiveShips(int liveShips) {
        this.liveShips = liveShips;
    }
}
