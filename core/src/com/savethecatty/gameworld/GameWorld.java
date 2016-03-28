package com.savethecatty.gameworld;

import com.savethecatty.gameobjects.Catty;

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
