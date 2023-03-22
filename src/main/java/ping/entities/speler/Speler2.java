package ping.entities.speler;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import ping.Ping;

import java.util.Optional;
import java.util.Set;

public class Speler2 extends Speler implements KeyListener, Collided, Collider {

    private Ping ping;

    public Speler2(Coordinate2D location, Ping ping) {
        super("sprites/player_2.png", location, new Size(40, 150));
        this.ping = ping;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.UP)) {
            setMotion(3, 180d);
        } else if (pressedKeys.contains(KeyCode.DOWN)) {
            setMotion(3, 0d);
        }
    }

    @Override
    public void onCollision(Collider collidingObject) {

    }
}