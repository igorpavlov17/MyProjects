package ai;

import logic.Cell;

import java.util.ArrayList;

public class AIKilling extends AIBase{
    public AIKilling(AI ai) {
        super(ai);
    }

    @Override
    protected int doShot() {
        ArrayList<Cell> cells = new ArrayList<>();
        draw(cells, dx, dy);
        draw(cells, -dx, -dy);

        if (cells.size() > 0){
            return cells.get(ai.random.nextInt(cells.size())).doShot();
        }

        ai.action = new AIRandom(ai);
        return ai.doShot();
    }

    public void draw(ArrayList<Cell> cells, int i, int j){
        int m = x;
        int n = y;

        do{
            m += i;
            n += j;
        } while ((ai.getField().isBound(m, n)) && (ai.getField().getCell(m, n).getState() == Cell.CELL_INJURED));

        if (ai.getField().isBound(m, n)){
            Cell cell = ai.getField().getCell(m, n);
            if (!cell.isMark()){
                cells.add(cell);
            }
        }
    }
}
