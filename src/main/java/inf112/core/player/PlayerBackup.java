package inf112.core.player;

import com.badlogic.gdx.math.Vector2;

public class PlayerBackup {
    private Vector2 position;

    public PlayerBackup(int xPos, int yPos){
        position = new Vector2(xPos, yPos);
    }

    public Vector2 getPosition() {
        return position;
    }

    public float getX(){
        return position.x;
    }

    public float getY(){
        return position.y;
    }
}
