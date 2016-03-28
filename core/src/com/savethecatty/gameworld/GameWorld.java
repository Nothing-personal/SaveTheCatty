package com.savethecatty.gameworld;

import com.savethecatty.gameobjects.Catty;

/**
 * Created by Кевин on 26.03.2016.
 */
public class GameWorld {

    private Catty catty;

    public GameWorld() {

    }

    public void update(float delta) {
        catty.update(delta);
    }
}
