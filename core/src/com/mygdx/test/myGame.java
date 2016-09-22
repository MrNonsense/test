package com.mygdx.test;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class myGame extends Game {

  SpriteBatch batch;
  Texture     img;

  @Override
  public void create() {
    Gdx.app.log("TestGame", "Application starting...");
    batch = new SpriteBatch();
    img = new Texture("badlogic.jpg");

  }

  public void render() {
    super.render();
  }

  public void dispose() {

  }

}
