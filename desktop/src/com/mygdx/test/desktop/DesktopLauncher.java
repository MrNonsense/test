package com.mygdx.test.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.testgame.MyGdxTest;
import com.mygdx.testgame.myGame;

public class DesktopLauncher {
  public static void main(String[] arg) {
    LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
    config.title = "TestGame";
    config.width = 272;
    config.height = 408;
    new LwjglApplication(new MyGdxTest(), config);
    //		new LwjglApplication(new myGame(), config);
  }
}
