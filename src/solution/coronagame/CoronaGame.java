package solution.coronagame;

import solution.engine.logic.GameImplementation;
import solution.engine.graphics.Renderer;

public class CoronaGame implements GameImplementation {

    Player player;
    float cameraZoom;
    int flipper = 1;
    @Override
    public void render(Renderer renderer) {
       player.render(renderer);
    }

    @Override
    public void update(float deltaTime) {
        player.update(deltaTime);
        camera.setX( - player.getX());
        camera.setY( - player.getY());
    }

    @Override
    public void init() {
        player = new Player();
    }

}