package ai;

public abstract class AIBase {
    protected AI ai;
    protected int x;
    protected int y;
    protected int dx;
    protected int dy;

    public AIBase(AI ai){
        this.ai = ai;
    }

    protected abstract int doShot();

    protected void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected void setDirection(int dx, int dy){
        this.dx = dx;
        this.dy = dy;
    }
}
