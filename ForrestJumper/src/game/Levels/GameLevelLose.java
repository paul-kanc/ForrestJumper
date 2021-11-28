package game.Levels;

public class GameLevelLose extends GameLevel {

    public GameLevelLose() {
        super();

        // remove bodies
        GameLevel.getMan().destroy();
        GameLevel.getReaper1().destroy();
        GameLevel.getReaper2().destroy();
        GameLevel.getReaper3().destroy();
        GameLevel.getCoin1().destroy();
        GameLevel.getCoin2().destroy();
        GameLevel.getCoin3().destroy();
        GameLevel.getCoin4().destroy();
        GameLevel.getCoin5().destroy();
        GameLevel.getHeart1().destroy();
    }

    @Override
    public boolean isComplete() {
        return true;
    }

    @Override
    public String getLevelName() {
        return null;
    }
}
