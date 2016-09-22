package com.mygdx.test.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.test.MyGdxTest;
import com.mygdx.test.myGame;

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
