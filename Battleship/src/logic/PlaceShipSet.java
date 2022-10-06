package logic;

public class PlaceShipSet extends PlaceShip{
    private Ship ship;

    public PlaceShipSet(Ship ship){
        super(ship);
        this.ship = ship;
    }

    @Override
    public boolean setShip(int x, int y){
        field.getCell(x, y).setState(Cell.CELL_WELL);
        ship.getCells().add(field.getCell(x, y));
        field.getCell(x, y).setShip(ship);
        return true;
    }

    @Override
    public boolean setAround(int x, int y){
        if (field.isBound(x, y)){
            field.getCell(x, y).setState(Cell.CELL_AROUND);
            ship.getArounds().add(field.getCell(x, y));
        }
        return true;
    }
}
