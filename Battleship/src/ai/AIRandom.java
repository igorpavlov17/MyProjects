package ai;

import logic.Cell;
import logic.Field;

import java.util.ArrayList;

public class AIRandom extends AIBase{
    public AIRandom(AI ai){
        super(ai);
    }

    @Override
    public int doShot() {
        ArrayList<Cell> cells = new ArrayList<>();
        for (int i = 0; i < ai.getField().getWidth(); i++) {
            for (int j = 0; j < ai.getField().getHeight(); j++) {
                Cell cell = ai.getField().getCell(j, i);
                if (!cell.isMark()){
                    cells.add(cell);
                }
            }
        }
        if (cells.size() == 0){
            return Field.SHOT_MISSED;
        }
        Cell cell = cells.get(ai.random.nextInt(cells.size()));
        int shot = cell.doShot();
        if (shot == Field.SHOT_INJURED){
            ai.action = new AIAround(ai);
            ai.action.setPosition(cell.x, cell.y);
        }
        return shot;
    }
}
