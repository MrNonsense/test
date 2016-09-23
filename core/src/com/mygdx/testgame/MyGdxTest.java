package com.mygdx.testgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.helpers.AssetLoader;
import com.mygdx.screens.GameScreen;

public class MyGdxTest extends Game {
  SpriteBatch batch;
  Texture     img;
  BitmapFont  font;

  @Override
  public void create() {
    Gdx.app.log("TestGame", "Application starting...");
    AssetLoader.load();
    //		batch = new SpriteBatch();
    //		img = new Texture("badlogic.jpg");
    //		font = new BitmapFont();
    setScreen(new GameScreen());
  }

  //	@Override
  //	public void render () {
  //		Gdx.gl.glClearColor(1, 0, 0, 1);
  //		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
  //		batch.begin();
  //		font.draw(batch, "TEXT", 42, 24);
  //		batch.draw(img, 0, 0);
  //		batch.end();
  //	}
  //	
  @Override
  public void dispose() {
    super.dispose();
    AssetLoader.dispose();
    //  		batch.dispose();
    //  		img.dispose();
    //  		font.dispose();
  }
}
