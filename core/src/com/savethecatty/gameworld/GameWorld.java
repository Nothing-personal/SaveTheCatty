package com.savethecatty.gameworld;

import com.savethecatty.gameobjects.Catty;

public class GameWorld {

    private Catty catty;

    public GameWorld(int midPointY) {
        catty = new Catty(61, midPointY - 10, 14, 20); // Check this parameters after drawing a texture
    }

    public void update(float delta) {
        catty.update(delta);
    }
    public Catty getCatty() {
        return catty;
    }
}
