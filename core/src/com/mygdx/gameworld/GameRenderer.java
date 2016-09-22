package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class GameRenderer {

  private GameWorld          world;
  private OrthographicCamera cam;
  private ShapeRenderer      shapeRenderer;

  public GameRenderer(GameWorld world_p) {
    world = world_p;
    cam = new OrthographicCamera();
    cam.setToOrtho(true, 136, 204);
    shapeRenderer = new ShapeRenderer();
    shapeRenderer.setProjectionMatrix(cam.combined);
  }

  public void render() {
    Gdx.app.log("GameRenderer", "render");
    // Sets a Color to Fill the Screen with (RGB = 0, 0, 0), Opacity of 1 (100%)
    Gdx.gl.glClearColor(0, 0, 0, 1);
    // Fills the screen with the selected color
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    //draw rectangle
    shapeRenderer.begin(ShapeType.Filled);
    shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
    shapeRenderer.rect(world.getRect().x, world.getRect().y, world.getRect().width, world.getRect().height);
    shapeRenderer.end();
    //draw rectangle outline
    shapeRenderer.begin(ShapeType.Line);
    shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
    shapeRenderer.rect(world.getRect().x, world.getRect().y, world.getRect().width, world.getRect().height);
    shapeRenderer.end();
  }

}
