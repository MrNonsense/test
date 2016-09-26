package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.mygdx.gameobjects.Bird;
import com.mygdx.helpers.AssetLoader;
// import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class GameRenderer {

  private GameWorld          world;
  private OrthographicCamera cam;
  private ShapeRenderer      shapeRenderer;
  private SpriteBatch        batcher;
  private int                gameHeight;
  private int                midPointY;
  //Game Objects
  private Bird               bird;

  //Game Assets
  private TextureRegion      bg, grass;
  private Animation          birdAnimation;
  private TextureRegion      birdMid, birdDown, birdUp;
  private TextureRegion      skullUp, skullDown, bar;

  public GameRenderer(GameWorld world_p, int gameHeight_p, int midPointY_p) {
    world = world_p;

    this.gameHeight = gameHeight_p;
    this.midPointY = midPointY_p;

    cam = new OrthographicCamera();
    cam.setToOrtho(true, 136, gameHeight);

    batcher = new SpriteBatch();
    batcher.setProjectionMatrix(cam.combined);
    shapeRenderer = new ShapeRenderer();
    shapeRenderer.setProjectionMatrix(cam.combined);

    initGameObjects();
    initAssets();
  }

  private void initGameObjects() {
    bird = world.getBird();
  }

  private void initAssets() {
    bg = AssetLoader.bg;
    grass = AssetLoader.grass;
    birdAnimation = AssetLoader.birdAnimation;
    birdMid = AssetLoader.bird;
    birdDown = AssetLoader.birdDown;
    birdUp = AssetLoader.birdUp;
    skullUp = AssetLoader.skullUp;
    skullDown = AssetLoader.skullDown;
    bar = AssetLoader.bar;
  }

  public void render(float runTime) {
//    Gdx.app.log("GameRenderer", "render");

    // Sets a Color to Fill the Screen with (RGB = 0, 0, 0), Opacity of 1 (100%)
    Gdx.gl.glClearColor(0, 0, 0, 1);
    // Fills the screen with the selected color
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    shapeRenderer.begin(ShapeType.Filled);

    // Draw Background color
    shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
    shapeRenderer.rect(0, 0, 136, midPointY + 66);

    // Draw Grass
    shapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
    shapeRenderer.rect(0, midPointY + 66, 136, 11);

    // Draw Dirt
    shapeRenderer.setColor(147 / 255.0f, 80 / 255.0f, 27 / 255.0f, 1);
    shapeRenderer.rect(0, midPointY + 77, 136, 52);

    // End ShapeRenderer
    shapeRenderer.end();

    batcher.begin();
    batcher.disableBlending();
    batcher.draw(bg, 0, midPointY + 23, 136, 43);

    batcher.enableBlending();
    if (bird.shouldntFlap()) {
      batcher.draw(birdMid, bird.getX(), bird.getY(), bird.getWidth() / 2.0f, bird.getHeight() / 2.0f, bird.getWidth(), bird.getHeight(), 1, 1, bird.getRotation());
    } else {
      batcher.draw(birdAnimation.getKeyFrame(runTime), bird.getX(), bird.getY(), bird.getWidth() / 2.0f, bird.getHeight() / 2.0f, bird.getWidth(), bird.getHeight(), 1, 1, bird.getRotation());
    }

    batcher.end();

    //    //draw rectangle
    //    shapeRenderer.begin(ShapeType.Filled);
    //    shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
    //    shapeRenderer.rect(world.getRect().x, world.getRect().y, world.getRect().width, world.getRect().height);
    //    shapeRenderer.end();
    //    //draw rectangle outline
    //    shapeRenderer.begin(ShapeType.Line);
    //    shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
    //    shapeRenderer.rect(world.getRect().x, world.getRect().y, world.getRect().width, world.getRect().height);
    //    shapeRenderer.end();
  }

}
