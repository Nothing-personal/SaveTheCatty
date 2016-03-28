package com.savethecatty.gameworld;

import com.savethecatty.gameobjects.Catty;

/**
 * Created by Кевин on 26.03.2016.
 */
public class GameWorld {

    private Catty catty;

    public GameWorld(int midPointY) {
        catty = new Catty(60, midPointY - 9, 16, 18);
    }

    public void update(float delta) {
        catty.update(delta);
    }
    public Catty getCatty() {
        return catty;
    }
}
