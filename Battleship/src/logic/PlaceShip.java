package logic;

public abstract class PlaceShip {
    public Field field;

    public PlaceShip(Ship ship){
        this.field = ship.getField();
    }

    public abstract boolean setShip(int x, int y);
    public abstract boolean setAround(int x, int y);
}
