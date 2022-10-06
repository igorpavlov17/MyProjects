package logic;

public class PlaceShipCheck extends PlaceShip{
    public PlaceShipCheck(Ship ship){
        super(ship);
    }

    @Override
    public boolean setShip(int x, int y){
        if (field.isBound(x, y)){
            return field.getCell(x, y).getState() == Cell.CELL_WATER;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean setAround(int x, int y){
        return true;
    }
}
