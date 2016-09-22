package com.mygdx.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.mygdx.gameworld.GameRenderer;
import com.mygdx.gameworld.GameWorld;

public class GameScreen implements Screen {

  private GameWorld    world;
  private GameRenderer renderer;

  public GameScreen() {
    Gdx.app.log("GameScreen", "Attached");
    world = new GameWorld();
    renderer = new GameRenderer(world);
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
    Gdx.app.log("GameScreen", "resize Called");

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
