package com.mygdx.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.mygdx.gameworld.GameRenderer;
import com.mygdx.gameworld.GameWorld;
import com.mygdx.helpers.inputHandler;

public class GameScreen implements Screen {

  private GameWorld    world;
  private GameRenderer renderer;

  public GameScreen() {
    Gdx.app.log("GameScreen", "Attached");
    float screenWidth = Gdx.graphics.getWidth();
    float screenHeight = Gdx.graphics.getHeight();
    float gameWidth = 136;
    float gameHeight = screenHeight / (screenWidth / gameWidth);

    int midPointY = (int)(gameHeight / 2);
    world = new GameWorld(midPointY);
    renderer = new GameRenderer(world);

    Gdx.input.setInputProcessor(new inputHandler(world.getBird()));
  }

  @Override
  public void show() {
    Gdx.app.log("GameScreen", "Show Called");

  }

  @Override
  public void render(float delta) {
    world.update(delta);
    renderer.render();
    // Covert Frame rate to String, print it
    //    Gdx.app.log("GameScreen FPS", Math.round((1 / delta)) + "");

  }

  @Override
  public void resize(int width, int height) {
    Gdx.app.log("GameScreen", "Resize Called");

  }

  @Override
  public void pause() {
    Gdx.app.log("GameScreen", "pause Called");

  }

  @Override
  public void resume() {
    Gdx.app.log("GameScreen", "resume Called");

  }

  @Override
  public void hide() {
    Gdx.app.log("GameScreen", "hide Called");

  }

  @Override
  public void dispose() {
    Gdx.app.log("GameScreen", "dispose Called");

  }

}
