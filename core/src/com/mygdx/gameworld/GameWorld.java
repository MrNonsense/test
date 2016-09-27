package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.gameobjects.Bird;
import com.mygdx.gameobjects.ScrollHandler;

public class GameWorld {

  //  private Rectangle rect = new Rectangle(0, 0, 17, 12);

  private Bird          bird;
  private ScrollHandler scroller;

  public GameWorld(int midPointY) {
    bird = new Bird(33, midPointY - 5, 17, 12);
    scroller = new ScrollHandler(midPointY + 66);
  }

  public void update(float delta) {
    //    Gdx.app.log("GameWorld", "update");
    bird.update(delta);
    scroller.update(delta);
    //    rect.x++;
    //    if (rect.x > 137) {
    //      rect.x = 0;
    //    }
  }

  //  public Rectangle getRect() {
  //    return rect;
  //  }

  public Bird getBird() {
    return bird;
  }

  public ScrollHandler getScroller() {
    return scroller;
  }

}
