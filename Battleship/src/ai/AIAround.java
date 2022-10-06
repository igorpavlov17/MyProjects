package ai;

import logic.Cell;
import logic.Field;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AIAround extends AIBase{
    public AIAround(AI ai) {
        super(ai);
    }

    @Override
    public int doShot(){
        int n, m;
        ArrayList<Cell> cells = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            n = y;
            m = x + i * 2 - 1;
            if (ai.getField().isBound(m, n)){
                Cell cell = ai.getField().getCell(m, n);
                if (!cell.isMark()){
                    cells.add(cell);
                }
            }
            n = y + i * 2 - 1;
            m = x;
            if (ai.getField().isBound(m, n)){
                Cell cell = ai.getField().getCell(m, n);
                if(!cell.isMark()){
                    cells.add(cell);
                }
            }
        }
        if (cells.size() > 0){
            Cell cell = cells.get(ai.random.nextInt(cells.size()));
            int shot = cell.doShot();
            if (shot == Field.SHOT_INJURED){
                ai.action = new AIKilling(ai);
                ai.action.setPosition(x, y);
                ai.action.setDirection(cell.x - x, cell.y - y);
            }
            return shot;
        }
        ai.action = new AIRandom(ai);
        return ai.doShot();
    }
}
